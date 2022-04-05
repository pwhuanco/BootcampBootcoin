package com.bootcamp.bootcoin.bean.bootcoin;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Document("exchangerate")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ExchangeRate {
    @Id
    private String id;

    private BigDecimal buy;
    private BigDecimal sell;
}
