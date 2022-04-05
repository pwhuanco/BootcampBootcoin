package com.bootcamp.bootcoin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDto {

    private String id;
    private String name;

    private String clientIdType;

    private String clientIdNumber;

    private String email;
    private String phone;
    private String address;
}
