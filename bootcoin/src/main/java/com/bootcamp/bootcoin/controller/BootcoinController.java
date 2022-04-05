package com.bootcamp.bootcoin.controller;

import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.service.BootcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

//@Slf4j
@RestController
@RequestMapping(path = "/api/bootcoin")
public class BootcoinController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootcoinController.class);

    @Resource
    private BootcoinService bootcoinService;

    @GetMapping("/exchange")
    public Mono<ExchangeRateDto> getExchangeRate() {
        LOGGER.debug("Getting Exchange!");
        return bootcoinService.getExchangeRate();
    }

    @PostMapping("/exchange")
    public Mono<ExchangeRateDto> setExchangeRate(@RequestBody ExchangeRateDto rate) {
        LOGGER.debug("Saving rate!");
        return bootcoinService.setExchangeRate(rate);
    }
/*
    @GetMapping
    public Flux<DepositDto> getDeposit() {
        LOGGER.debug("Getting Deposit!");
        return depositService.getDeposit();
    }

    @GetMapping("/{id}")
    public Mono<DepositDto> getDeposit(@PathVariable String id) {
        LOGGER.debug("Getting a deposit!");
        return depositService.getDepositById(id);
    }

    @PostMapping
    public Mono<DepositDto> saveDeposit(@RequestBody DepositDto depositDtoMono) {
        LOGGER.debug("Saving deposit!");
        return depositService.saveDeposit(depositDtoMono);
    }

    @PutMapping("/{id}")
    public Mono<DepositDto> updateDeposit(@RequestBody Mono<DepositDto> depositDtoMono, @PathVariable String id) {
        LOGGER.debug("Updating deposit!");
        return depositService.updateDeposit(depositDtoMono, id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteDeposit(@PathVariable String id) {
        LOGGER.debug("Deleting deposit!");
        return depositService.deleteDeposit(id);
    }*/

}