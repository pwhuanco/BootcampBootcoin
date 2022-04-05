package com.bootcamp.bootcoin.repository;

import com.bootcamp.bootcoin.bean.bootcoin.BootcoinRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

@Configuration
public interface BootcoinRequestRepository extends ReactiveMongoRepository<BootcoinRequest, String> {
    Flux<BootcoinRequest> findByClientIdNumber(String clientIdNumber);

}
