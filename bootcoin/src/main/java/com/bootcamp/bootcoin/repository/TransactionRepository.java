package com.bootcamp.bootcoin.repository;

import com.bootcamp.bootcoin.bean.bootcoin.Transaction;
import com.bootcamp.bootcoin.bean.bootcoin.Wallet;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

@Configuration
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    Mono<Transaction> findByTransactionId(String transactId);

}
