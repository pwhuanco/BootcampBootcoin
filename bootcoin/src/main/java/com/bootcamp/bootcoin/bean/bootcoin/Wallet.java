package com.bootcamp.bootcoin.bean.bootcoin;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;
@Document("wallet")
@Data
public class Wallet {

    @Id
    private String id;

    private String walletNumber;

    private String clientIdNumber;

    private BigDecimal balance;

    private String accountNumber;
}
