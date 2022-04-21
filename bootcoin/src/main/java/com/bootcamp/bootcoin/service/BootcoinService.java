package com.bootcamp.bootcoin.service;

import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import com.bootcamp.bootcoin.dto.bootcoin.BootcoinRequestDto;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.dto.bootcoin.TransactionDto;
import com.bootcamp.bootcoin.dto.bootcoin.WalletDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinService {

    Mono<ExchangeRateDto> getExchangeRate();

    Mono<ExchangeRateDto> setExchangeRate(ExchangeRateDto rate);

    Mono<WalletDto> findWalletByIdClient(String clientIdNumber);
    Mono<WalletDto> createWallet(WalletDto wallet);

    Flux<BootcoinRequestDto> getRequestBootcoinBuy(String clientIdNumber);
    Flux<BootcoinRequestDto> getRequestBootcoinBuy();

    Mono<BootcoinRequestDto> saveRequestBootcoinBuy(BootcoinRequestDto req);
    Mono<TransactionDto> acceptRequest(String req);


}
