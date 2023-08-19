package com.example.bank.business;

import com.example.bank.entity.BankAccount;
import com.example.bank.repository.BankAccountRepository;
import com.example.protobuf.Bank;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Slf4j
public class BankAccountBusiness {

    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountBusiness(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Transactional
    public Bank.CommitOutBalanceResponse commit(Bank.CommitOutBalanceRequest request) {
        log.info("commit request :: {}", request);
        try {
            List<BankAccount> bankAccounts =
                    bankAccountRepository.findAllByUserId(request.getUserId());
            AtomicReference<Long> balance = new AtomicReference<>(0L);
            bankAccounts.stream()
                    .forEach(bankAccount -> balance.updateAndGet(v -> v + bankAccount.getAmount()));
            if (balance.get() +request.getAmount() >= 0) {
                BankAccount bankAccount = new BankAccount();
                bankAccount.setId(UUID.randomUUID());
                bankAccount.setCreatedTime(new Timestamp(System.currentTimeMillis()));
                bankAccount.setTransactionId(UUID.fromString(request.getTransactionId()));
                bankAccount.setAmount(request.getAmount());
                bankAccount.setUserId(request.getUserId());
                bankAccountRepository.save(bankAccount);
            } else {
                return  Bank.CommitOutBalanceResponse.newBuilder()
                        .setStatus("FAILED")
                        .build();
            }
        } catch (Exception e) {
            log.error("ERROR", e);
            return  Bank.CommitOutBalanceResponse.newBuilder()
                    .setStatus("FAILED")
                    .build();
        }

        return  Bank.CommitOutBalanceResponse.newBuilder()
                .setStatus("SUCCESSFULLY")
                .build();
    }

    @Transactional
    public Bank.RedoOutBalanceResponse redo(Bank.RedoOutBalanceRequest request) {
        log.info("redo request :: {}", request);
        try {
            bankAccountRepository.deleteByTransactionId(UUID.fromString(request.getTransactionId()));
        } catch (Exception e) {
            log.error("ERROR", e);
            return  Bank.RedoOutBalanceResponse.newBuilder()
                    .setStatus("FAILED")
                    .build();
        }

        return  Bank.RedoOutBalanceResponse.newBuilder()
                .setStatus("SUCCESSFULLY")
                .build();
    }
}
