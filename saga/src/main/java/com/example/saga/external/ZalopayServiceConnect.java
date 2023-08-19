package com.example.saga.external;

import com.example.protobuf.Zalopay;
import com.example.protobuf.ZalopayServiceGrpc;
import com.example.saga.command.ExchangeCommand;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ZalopayServiceConnect {

    private final ManagedChannel channel = ManagedChannelBuilder
            .forAddress("localhost", 9092).usePlaintext().build();

    public String commit(ExchangeCommand command) {
        try {
            Zalopay.CommitInBalanceResponse response =
                    ZalopayServiceGrpc.newBlockingStub(channel)
                            .commitInBalance(
                                    Zalopay.CommitInBalanceRequest.newBuilder()
                                            .setAmount(command.getAmount())
                                            .setUserId(command.getUserId())
                                            .setTransactionId(command.getTransactionId())
                                            .build());
            return response.getStatus();
        } catch (Exception e) {
            log.error("ERROR:: ", e);
            return "FAILED";
        }
    }

    public String redo(ExchangeCommand command) {
        try {
            Zalopay.RedoInBalanceResponse response =
                    ZalopayServiceGrpc.newBlockingStub(channel)
                            .redoInBalance(
                                    Zalopay.RedoInBalanceRequest.newBuilder()
                                            .setTransactionId(command.getTransactionId())
                                            .build());
            return response.getStatus();
        } catch (Exception e) {
            log.error("Error: ", e);
            return "FAILED";
        }
    }
}
