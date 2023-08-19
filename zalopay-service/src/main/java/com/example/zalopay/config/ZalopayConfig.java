package com.example.zalopay.config;

import com.example.zalopay.business.ZaloPayBusiness;
import com.example.zalopay.repository.ZaloWalletRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ZalopayConfig {

    public ZaloPayBusiness zaloPayBusiness(ZaloWalletRepository zaloWalletRepository) {
        return new ZaloPayBusiness(zaloWalletRepository);
    }
}
