package com.bootcamp.bootcoin.util;

import com.bootcamp.bootcoin.bean.bootcoin.BootcoinRequest;
import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import com.bootcamp.bootcoin.dto.bootcoin.BootcoinRequestDto;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ExchangeRateDto entityExToDto(ExchangeRate deposit) {
        ExchangeRateDto accDto = new ExchangeRateDto();
        BeanUtils.copyProperties(deposit, accDto);
        return accDto;
    }

    public static ExchangeRate dtoToEntityEx(ExchangeRateDto accDto) {
        ExchangeRate deposit = new ExchangeRate();
        BeanUtils.copyProperties(accDto, deposit);
        return deposit;
    }

    public static BootcoinRequestDto entityReqCoinToDto(ExchangeRate deposit) {
        BootcoinRequestDto accDto = new BootcoinRequestDto();
        BeanUtils.copyProperties(deposit, accDto);
        return accDto;
    }

    public static BootcoinRequest dtoToEntityReqCoin(BootcoinRequestDto dto) {
        BootcoinRequest deposit = new BootcoinRequest();
        BeanUtils.copyProperties(dto, deposit);
        return deposit;
    }
}
