package com.bootcamp.bootcoin.bean.bootcoin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;

@Document("bootcoinrequest")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BootcoinRequest {
    @Id
    private String id;
    /**
     *  solicitante
     */
    private String clientIdNumber;
    /**
     * solicitado
     */
    private String clientIdNumberRequested;

    private BigDecimal amount;
    /**
     * cuentas 1,corriente 2,yanki 3
     */
    private String payMode;
    private BigDecimal exchangeRateBuy;
    private String timestamp;
    //@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    private Integer transactionId; // del objeto transaccion, cuando exista


}
