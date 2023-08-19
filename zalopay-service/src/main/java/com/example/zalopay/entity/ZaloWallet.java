package com.example.zalopay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "zalo_wallet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZaloWallet {
    @Id
    private UUID id;
    private String userId;
    private Long amount;
    private UUID transactionId;
    private Timestamp createdTime;
}
