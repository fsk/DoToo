package com.doto.doto.service;

import com.doto.doto.documents.Account;
import com.doto.doto.dto.documents.AccountDto;

import com.doto.doto.dto.request.createrequest.CreateAccountRequest;



import com.doto.doto.mapper.AccountMapper;
import com.doto.doto.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;


    public AccountDto createAccount(CreateAccountRequest createAccountRequest){

        Account account = AccountMapper.toDocumentsFromCreateAccountDto(createAccountRequest);

        return AccountMapper.toDto(accountRepository.save(account));

    }
}
