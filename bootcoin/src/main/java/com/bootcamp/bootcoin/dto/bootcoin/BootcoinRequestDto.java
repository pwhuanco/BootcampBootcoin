package com.bootcamp.bootcoin.dto.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BootcoinRequestDto {

    private String id;
    private String clientIdNumber;
    private String clientIdNumberRequested;
    private BigDecimal amount;
    private String payMode;
    private BigDecimal exchangeRateBuy;
    private String timestamp;
    //@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    private Integer transactionId;
}
