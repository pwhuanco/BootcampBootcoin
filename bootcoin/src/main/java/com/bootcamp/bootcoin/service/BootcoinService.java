package com.bootcamp.bootcoin.service;

import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import reactor.core.publisher.Mono;

public interface BootcoinService {

    Mono<ExchangeRateDto> getExchangeRate();

    Mono<ExchangeRateDto> setExchangeRate(ExchangeRateDto rate);
    /*
    Flux<DepositDto> getDeposit();

    Mono<DepositDto> getDepositById(String id);

    Mono<AccountDto> doTransfer(DepositDto depositDto);

    Mono<DepositDto> saveDeposit(DepositDto depositDtoMono);

    Mono<DepositDto> updateDeposit(Mono<DepositDto> depositDtoMono, String id);

    Mono<Void> deleteDeposit(String id);*/

}
