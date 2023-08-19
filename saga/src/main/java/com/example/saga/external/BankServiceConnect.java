package com.example.saga.external;

import com.example.protobuf.Bank;
import com.example.protobuf.BankServiceGrpc;
import com.example.saga.command.ExchangeCommand;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BankServiceConnect {

    private final ManagedChannel channel = ManagedChannelBuilder
            .forAddress("localhost", 9091).usePlaintext().build();

    public String commit(ExchangeCommand command) {
        try {
            Bank.CommitOutBalanceResponse response =
                    BankServiceGrpc.newBlockingStub(channel)
                            .commitOutBalance(
                                    Bank.CommitOutBalanceRequest.newBuilder()
                                            .setAmount(command.getAmount())
                                            .setUserId(command.getUserId())
                                            .setTransactionId(command.getTransactionId())
                                            .build());
            return response.getStatus();
        } catch (Exception e) {
            log.error("Error", e);
            return "FAILED";
        }
    }

    public String redo(ExchangeCommand command) {
        try {
            Bank.RedoOutBalanceResponse response =
                    BankServiceGrpc.newBlockingStub(channel)
                            .redoOutBalance(
                                    Bank.RedoOutBalanceRequest.newBuilder()
                                            .setTransactionId(command.getTransactionId())
                                            .build()
                            );
            return response.getStatus();
        } catch (Exception e) {
            log.error("Error", e);
            return "FAILED";
        }
    }
}
