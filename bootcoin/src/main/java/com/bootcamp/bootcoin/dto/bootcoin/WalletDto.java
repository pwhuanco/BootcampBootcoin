package com.bootcamp.bootcoin.dto.bootcoin;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
public class WalletDto {

    private String id;

    private String walletNumber;

    private String clientIdNumber;

    private BigDecimal balance;

    private String accountNumber;
}
