package com.example.bank.config;

import com.example.bank.business.BankAccountBusiness;
import com.example.bank.repository.BankAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BankConfig {

    public BankAccountBusiness bankAccountBusiness(BankAccountRepository bankAccountRepository) {
        return new BankAccountBusiness(bankAccountRepository);
    }
}
