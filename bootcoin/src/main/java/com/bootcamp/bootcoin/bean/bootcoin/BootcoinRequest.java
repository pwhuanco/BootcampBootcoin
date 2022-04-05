package com.bootcamp.bootcoin.bean.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("bootcoinrequest")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BootcoinRequest {
    @Id
    private String id;
    private Double amount;
    private String payMode;
    private String timestamp;
}
