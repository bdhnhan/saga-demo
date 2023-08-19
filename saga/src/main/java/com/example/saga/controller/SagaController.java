package com.example.saga.controller;

import com.example.saga.business.ExchangeBusiness;
import com.example.saga.controller.request.ExchangeRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
@Slf4j
public class SagaController {
    private final ExchangeBusiness exchangeBusiness;

    public SagaController(ExchangeBusiness exchangeBusiness) {
        this.exchangeBusiness = exchangeBusiness;
    }

    @PostMapping("/inWallet")
    public String exchange(@RequestBody ExchangeRequest request) {
        return exchangeBusiness.exchangeAmountInWallet(request);
    }
}
