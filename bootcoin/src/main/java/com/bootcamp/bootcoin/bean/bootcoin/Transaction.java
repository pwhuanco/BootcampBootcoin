package com.bootcamp.bootcoin.bean.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document("transaction")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {

    @Id
    private String id;

    @Indexed(name = "transactionId")
    private Integer transactionId = 0;

    private String walletNumberOrig;
    private String walletNumberDest;

    private BigDecimal bootcoinAmount;
    private BigDecimal moneyAmount;

    public Transaction(String walletNumberOrig, String walletNumberDest, BigDecimal bootcoinAmount, BigDecimal moneyAmount) {
        this.walletNumberOrig = walletNumberOrig;
        this.walletNumberDest = walletNumberDest;
        this.bootcoinAmount = bootcoinAmount;
        this.moneyAmount = moneyAmount;
    }
}
