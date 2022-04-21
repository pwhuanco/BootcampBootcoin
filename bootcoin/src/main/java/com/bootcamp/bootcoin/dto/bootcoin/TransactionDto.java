package com.bootcamp.bootcoin.dto.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TransactionDto {

    private String id;

    private Integer transactionId;

    private String walletNumberOrig;
    private String walletNumberDest;

    private BigDecimal bootcoinAmount;
    private BigDecimal moneyAmount;
}
