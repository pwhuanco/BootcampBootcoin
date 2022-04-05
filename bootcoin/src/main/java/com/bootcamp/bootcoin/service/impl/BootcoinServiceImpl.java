package com.bootcamp.bootcoin.service.impl;

import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.repository.ExchangeRateRepository;
import com.bootcamp.bootcoin.service.BootcoinService;
import com.bootcamp.bootcoin.util.AppUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class BootcoinServiceImpl implements BootcoinService {

    /*@Value("${microservice-accounts.uri}")
    private String urlAccounts;
    @Value("${apiclient.uri}")
    private String urlApigateway;
*/

    @Autowired
    private ExchangeRateRepository exchangeRepo;

    /**
     * El banco debe poder establecer la tasa de compra y venta de Soles a BootCoin.
     * @return
     */
    @Override
    public Mono<ExchangeRateDto> getExchangeRate() {
        return exchangeRepo.findAll().last().map(AppUtils::entityExToDto);
    }
    @Override
    public Mono<ExchangeRateDto> setExchangeRate(ExchangeRateDto rate) {
        return exchangeRepo.save(AppUtils.dtoToEntityEx(rate)).map(AppUtils::entityExToDto);
    }

    /*@Autowired
    private WebClient.Builder webClient;
    @Autowired
    private RestTemplate restTemplate;*/

    /*
    public Flux<DepositDto> getDeposit() {
        log.debug("In getDeposit()");
        return depositRepository.findAll().map(AppUtils::entityToDto);
    }

    @Override
    public Mono<DepositDto> getDepositById(String id) {
        return depositRepository.findById(id)
                .map(AppUtils::entityToDto);
    }

    @Override
    public Mono<AccountDto> doTransfer(DepositDto depositDto) {
        AccountDto accountOutgoing = restTemplate.getForObject(urlApigateway + urlAccounts + depositDto.getFromAccountId(), AccountDto.class);
        AccountDto accountDestination = restTemplate.getForObject(urlApigateway + urlAccounts + depositDto.getToAccountId(), AccountDto.class);
        if (accountOutgoing.getBalance() >= depositDto.getAmount() && accountOutgoing.getCurrency() == accountDestination.getCurrency()) {
            accountOutgoing.setBalance(accountDestination.getBalance() - depositDto.getAmount());
            accountDestination.setBalance(accountDestination.getBalance() + depositDto.getAmount());
            return Mono.just(accountDestination);
        } else {
            return null;
        }

    }

    public Mono<DepositDto> saveDeposit(DepositDto depositDto) {
        log.debug("url a invocar:" + urlApigateway + urlAccounts);

        AccountDto account = obtainAccountToDeposit(depositDto);

        if (approveDeposit(account, depositDto)) {
            log.debug("calculateBalance:");
            calculateBalance(account, depositDto);
            log.debug("updateBalanceAccount:");
            updateBalanceAccount(account);
            log.debug("savingDeposit:");
            return savingDeposit(depositDto);
        } else {
            return Mono.just(new DepositDto());
        }
    }

    private AccountDto obtainAccountToDeposit(DepositDto depositDto) {
        AccountDto account = restTemplate
                .getForObject(urlApigateway + urlAccounts +
                                depositDto.getToAccountId(),
                        AccountDto.class);
        log.debug("restTemplate:" + account.getAccountNumber());
        return account;
    }

    private Mono<DepositDto> savingDeposit(DepositDto depositDto) {
        log.debug("Service.savingDeposit");
        return Mono.just(depositDto).map(AppUtils::dtoToEntity)
                .flatMap(depositRepository::insert)
                .map(AppUtils::entityToDto);
    }

    private void updateBalanceAccount(AccountDto account) {
        account.setMovementPerMonth(account.getMovementPerMonth() + 1);
        restTemplate.put(urlApigateway + urlAccounts + account.getId(), account);
    }

    /**
     * Pasivos (cuentas bancarias)
     * -Ahorro:
     * libre  de  comisión  por  mantenimiento  y  con  un  límite máximo de movimientos mensuales.
     * -Cuenta  corriente:  posee  comisión  de mantenimiento y  sin  límite de movimientos mensuales.
     * -Plazo  fijo:  libre  de  comisión  por  mantenimiento, solo  permite  un movimiento de
     * retiro o depósito en un día específico del mes.
     */
    /*private boolean approveDeposit(AccountDto account, DepositDto depositDto) {
        if (Constant.TIPO_CUENTA_PLAZO.equalsIgnoreCase(account.getAccountType())) {
            if (Constant.CAN_BE_DEPOSIT.equalsIgnoreCase(account.getCanBeDeposit())) {
                return true;
            }
        } else if (Constant.TIPO_CUENTA_AHORRO.equalsIgnoreCase(account.getAccountType())) {
            if (account.getMovementPerMonth() <= account.getMaxLimitMovementPerMonth()) {
                return true;
            }
        } else if (Constant.TIPO_CUENTA_CORRIENTE.equalsIgnoreCase(account.getAccountType())) {
            return true;
        }
        return false;
    }

    private void calculateBalance(AccountDto account, DepositDto depositDto) throws NumberFormatException {
        BigDecimal balance = BigDecimal.valueOf(account.getBalance());
        BigDecimal amount = BigDecimal.valueOf(depositDto.getAmount());
        BigDecimal newBalance = balance.add(amount);
        account.setBalance(newBalance.doubleValue());
    }

    public Mono<DepositDto> updateDeposit(Mono<DepositDto> DepositDtoMono, String id) {
        return depositRepository.findById(id)
                .flatMap(p -> DepositDtoMono.map(AppUtils::dtoToEntity)
                        .doOnNext(e -> e.setId(id)))
                .flatMap(depositRepository::save)
                .map(AppUtils::entityToDto);
    }

    public Mono<Void> deleteDeposit(String id) {
        return depositRepository.deleteById(id);
    }*/
}
