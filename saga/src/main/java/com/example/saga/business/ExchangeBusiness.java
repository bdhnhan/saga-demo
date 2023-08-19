package com.example.saga.business;

import com.example.saga.command.ExchangeCommand;
import com.example.saga.controller.request.ExchangeRequest;
import com.example.saga.external.BankServiceConnect;
import com.example.saga.external.ZalopayServiceConnect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class ExchangeBusiness {

    private final BankServiceConnect bankServiceConnect;
    private final ZalopayServiceConnect zalopayServiceConnect;

    public ExchangeBusiness(BankServiceConnect bankServiceConnect,
                            ZalopayServiceConnect zalopayServiceConnect) {
        this.bankServiceConnect = bankServiceConnect;
        this.zalopayServiceConnect = zalopayServiceConnect;
    }

    public String exchangeAmountInWallet(ExchangeRequest request) {
        log.info("PROCESSING DATA: {}", request);
        List<UUID> transactionIds = new ArrayList<>();
        transactionIds.add(UUID.randomUUID());
        transactionIds.add(UUID.randomUUID());

        //commit first transaction
        ExchangeCommand command0 = ExchangeCommand.builder()
                .amount(-request.getAmount())
                .createdTime(System.currentTimeMillis())
                .transactionId(transactionIds.get(0).toString())
                .userId(request.getUserId())
                .build();
        String status0 = bankServiceConnect.commit(command0);
        log.info("status0 :: {}", status0);
        if (!status0.equals("SUCCESSFULLY")) {
            return "FAILED";
        }

        //commit second transaction
        ExchangeCommand command1 = ExchangeCommand.builder()
                .amount(request.getAmount())
                .createdTime(System.currentTimeMillis())
                .transactionId(transactionIds.get(1).toString())
                .userId(request.getUserId())
                .build();
        String status1 = zalopayServiceConnect.commit(command1);
        log.info("status1 :: {}", status1);
        if (!status1.equals("SUCCESSFULLY")) {
            redo(transactionIds.get(0));
            return "FAILED";
        }
        return "OK";
    }

    public void redo(UUID transFailed) {
        String status = "FAILED";
        while (status.equals("FAILED")) {
            status = bankServiceConnect.redo(
                    ExchangeCommand.builder().transactionId(transFailed.toString()).build()
            );
        }
    }
}
