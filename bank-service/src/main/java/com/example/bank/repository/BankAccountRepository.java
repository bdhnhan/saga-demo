package com.example.bank.repository;

import com.example.bank.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface BankAccountRepository extends CrudRepository<BankAccount, UUID>,
        JpaRepository<BankAccount, UUID> {
    void deleteByTransactionId(UUID uuid);
    List<BankAccount> findAllByUserId(String userId);
}
