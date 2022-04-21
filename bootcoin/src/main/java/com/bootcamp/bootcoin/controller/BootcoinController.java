package com.bootcamp.bootcoin.controller;

import com.bootcamp.bootcoin.bean.bootcoin.BootcoinRequest;
import com.bootcamp.bootcoin.dto.bootcoin.BootcoinRequestDto;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.dto.bootcoin.TransactionDto;
import com.bootcamp.bootcoin.dto.bootcoin.WalletDto;
import com.bootcamp.bootcoin.service.BootcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

//@Slf4j
@RestController
@RequestMapping(path = "/api/bootcoin")
public class BootcoinController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootcoinController.class);

    @Resource
    private BootcoinService bootcoinService;

    @GetMapping("/wallet/{idClient}")
    public Mono<WalletDto> getExchangeRate(@PathVariable String idClient) {
        LOGGER.debug("Saving WalletDto!"+idClient);
        return bootcoinService.findWalletByIdClient(idClient);
    }
    @PostMapping("/wallet")
    public Mono<WalletDto> setExchangeRate(@RequestBody WalletDto wallet) {
        LOGGER.debug("Saving WalletDto!");
        return bootcoinService.createWallet(wallet);
    }

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

    @GetMapping("/request/")
    public Flux<BootcoinRequestDto> getRequestBootcoinBuy(){
        LOGGER.debug("Getting request!");
        return bootcoinService.getRequestBootcoinBuy();
    }
    @GetMapping("/request/{idClient}")
    public Flux<BootcoinRequestDto> getRequestBootcoinBuy(@PathVariable("idClient")String idClient){
        LOGGER.debug("Getting request!");
        return bootcoinService.getRequestBootcoinBuy(idClient);
    }
    @PostMapping("/request")
    public Mono<BootcoinRequestDto> saveRequestBuy(@RequestBody BootcoinRequestDto depositDtoMono) {
        LOGGER.debug("Saving BootcoinRequest!");
        return bootcoinService.saveRequestBootcoinBuy(depositDtoMono);
    }

    @PostMapping("/request/accept/{reqId}")
    public Mono<TransactionDto> acceptRequest(@PathVariable("reqId") String reqId) {
        LOGGER.debug("Saving acceptRequest!");
        return bootcoinService.acceptRequest(reqId);
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
