package com.bootcamp.bootcoin.repository;

import com.bootcamp.bootcoin.bean.bootcoin.BootcoinRequest;
import com.bootcamp.bootcoin.bean.bootcoin.Wallet;
import com.bootcamp.bootcoin.dto.bootcoin.WalletDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

@Configuration
public interface WalletRepository extends ReactiveMongoRepository<Wallet, String> {
    Mono<Wallet> findByClientIdNumber(String idClient);

}
