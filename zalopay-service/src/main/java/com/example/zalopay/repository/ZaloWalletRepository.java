package com.example.zalopay.repository;

import com.example.zalopay.entity.ZaloWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ZaloWalletRepository extends CrudRepository<ZaloWallet, UUID>,
        JpaRepository<ZaloWallet, UUID> {
    void deleteByTransactionId(UUID uuid);
    List<ZaloWallet> findAllByUserId(String userId);
}
