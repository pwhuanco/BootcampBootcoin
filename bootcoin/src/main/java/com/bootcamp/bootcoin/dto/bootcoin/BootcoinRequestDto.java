package com.bootcamp.bootcoin.dto.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BootcoinRequestDto {

    private String id;
    private Double amount;
    private String payMode;
    private String timestamp;
}
