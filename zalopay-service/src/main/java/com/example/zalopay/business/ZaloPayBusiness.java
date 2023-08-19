package com.example.zalopay.business;

import com.example.protobuf.Zalopay;
import com.example.zalopay.entity.ZaloWallet;
import com.example.zalopay.repository.ZaloWalletRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Slf4j
public class ZaloPayBusiness {
    private final ZaloWalletRepository zaloWalletRepository;

    public ZaloPayBusiness(ZaloWalletRepository zaloWalletRepository) {
        this.zaloWalletRepository = zaloWalletRepository;
    }

    @Transactional
    public Zalopay.CommitInBalanceResponse commit(Zalopay.CommitInBalanceRequest request) {
        log.info("commit request :: {}", request);
        try {
            List<ZaloWallet> bankAccounts =
                    zaloWalletRepository.findAllByUserId(request.getUserId());

            if (!bankAccounts.isEmpty()) {
                ZaloWallet zaloWallet = new ZaloWallet();
                zaloWallet.setId(UUID.randomUUID());
                zaloWallet.setCreatedTime(new Timestamp(System.currentTimeMillis()));
                zaloWallet.setTransactionId(UUID.fromString(request.getTransactionId()));
                zaloWallet.setAmount(request.getAmount());
                zaloWallet.setUserId(request.getUserId());
                zaloWalletRepository.save(zaloWallet);
            } else {
                return  Zalopay.CommitInBalanceResponse.newBuilder()
                        .setStatus("FAILED")
                        .build();
            }
        } catch (Exception e) {
            log.error("ERROR", e);
            return  Zalopay.CommitInBalanceResponse.newBuilder()
                    .setStatus("FAILED")
                    .build();
        }

        return  Zalopay.CommitInBalanceResponse.newBuilder()
                .setStatus("SUCCESSFULLY")
                .build();
    }

    @Transactional
    public Zalopay.RedoInBalanceResponse redo(Zalopay.RedoInBalanceRequest request) {
        log.info("redo request :: {}", request);
        try {
            zaloWalletRepository.deleteByTransactionId(UUID.fromString(request.getTransactionId()));
        } catch (Exception e) {
            log.error("ERROR", e);
            return  Zalopay.RedoInBalanceResponse.newBuilder()
                    .setStatus("FAILED")
                    .build();
        }

        return  Zalopay.RedoInBalanceResponse.newBuilder()
                .setStatus("SUCCESSFULLY")
                .build();
    }
}
