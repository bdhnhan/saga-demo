package com.example.saga.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExchangeCommand {
    private String userId;
    private Long amount;
    private Long createdTime;
    private String transactionId;
}
