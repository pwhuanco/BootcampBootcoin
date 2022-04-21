package com.bootcamp.bootcoin.dto.bootcoin;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ExchangeRateDto {

    private String id;
    private BigDecimal buy;
    private BigDecimal sell;
}
