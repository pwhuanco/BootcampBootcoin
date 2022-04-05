package com.bootcamp.bootcoin.repository;

import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface ExchangeRateRepository extends ReactiveMongoRepository<ExchangeRate, String> {

}
