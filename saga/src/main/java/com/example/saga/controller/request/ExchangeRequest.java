package com.example.saga.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExchangeRequest {
    private String userId;
    private Long amount;
    private Long createdTime;
}
