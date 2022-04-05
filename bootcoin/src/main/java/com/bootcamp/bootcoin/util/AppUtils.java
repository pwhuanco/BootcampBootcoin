package com.bootcamp.bootcoin.util;

import com.bootcamp.bootcoin.bean.bootcoin.BootcoinRequest;
import com.bootcamp.bootcoin.bean.bootcoin.ExchangeRate;
import com.bootcamp.bootcoin.bean.bootcoin.Transaction;
import com.bootcamp.bootcoin.bean.bootcoin.Wallet;
import com.bootcamp.bootcoin.dto.bootcoin.BootcoinRequestDto;
import com.bootcamp.bootcoin.dto.bootcoin.ExchangeRateDto;
import com.bootcamp.bootcoin.dto.bootcoin.TransactionDto;
import com.bootcamp.bootcoin.dto.bootcoin.WalletDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ExchangeRateDto entityExToDto(ExchangeRate deposit) {
        ExchangeRateDto accDto = new ExchangeRateDto();
        BeanUtils.copyProperties(deposit, accDto);
        return accDto;
    }

    public static ExchangeRate dtoToEntityEx(ExchangeRateDto accDto) {
        ExchangeRate deposit = new ExchangeRate();
        BeanUtils.copyProperties(accDto, deposit);
        return deposit;
    }

    public static BootcoinRequestDto entityReqCoinToDto(BootcoinRequest deposit) {
        BootcoinRequestDto accDto = new BootcoinRequestDto();
        BeanUtils.copyProperties(deposit, accDto);
        return accDto;
    }

    public static BootcoinRequest dtoToEntityReqCoin(BootcoinRequestDto dto) {
        BootcoinRequest deposit = new BootcoinRequest();
        BeanUtils.copyProperties(dto, deposit);
        return deposit;
    }

    public static WalletDto entityWalletToDto(Wallet deposit) {
        WalletDto accDto = new WalletDto();
        BeanUtils.copyProperties(deposit, accDto);
        return accDto;
    }

    public static Wallet dtoToEntityWallet(WalletDto dto) {
        Wallet deposit = new Wallet();
        BeanUtils.copyProperties(dto, deposit);
        return deposit;
    }

    public static TransactionDto entityTransactToDto(Transaction a) {
        TransactionDto accDto = new TransactionDto();
        BeanUtils.copyProperties(a, accDto);
        return accDto;
    }

    public static Transaction dtoToEntityTransact(TransactionDto dto) {
        Transaction deposit = new Transaction();
        BeanUtils.copyProperties(dto, deposit);
        return deposit;
    }
}
