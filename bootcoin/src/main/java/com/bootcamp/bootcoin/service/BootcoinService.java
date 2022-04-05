package com.bootcamp.bootcoin.service;

import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import com.bootcamp.bootcoin.dto.bootcoin.BootcoinRequestDto;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.dto.bootcoin.TransactionDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinService {

    Mono<ExchangeRateDto> getExchangeRate();

    Mono<ExchangeRateDto> setExchangeRate(ExchangeRateDto rate);

    Flux<BootcoinRequestDto> getRequestBootcoinBuy(String clientIdNumber);
    Flux<BootcoinRequestDto> getRequestBootcoinBuy();

    Mono<BootcoinRequestDto> saveRequestBootcoinBuy(BootcoinRequestDto req);
    Mono<TransactionDto> acceptRequest(String req);
    /*
    Flux<DepositDto> getDeposit();

    Mono<DepositDto> getDepositById(String id);

    Mono<AccountDto> doTransfer(DepositDto depositDto);

    Mono<DepositDto> saveDeposit(DepositDto depositDtoMono);

    Mono<DepositDto> updateDeposit(Mono<DepositDto> depositDtoMono, String id);

    Mono<Void> deleteDeposit(String id);*/

}
