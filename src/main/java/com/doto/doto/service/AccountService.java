package com.doto.doto.service;

import com.doto.doto.documents.Account;
import com.doto.doto.dto.request.CreateAccountRequest;
import com.doto.doto.dto.response.CreateAccountResponse;
import com.doto.doto.mapper.AccountMapper;
import com.doto.doto.mapper.CreateAccountResponseMapper;
import com.doto.doto.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;


    public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest){

        Account account = accountRepository.save(AccountMapper.toDocumentsFromCreateAccountDto(createAccountRequest));

        return CreateAccountResponseMapper.toDtoFromAccountDto(AccountMapper.toDto(account));

    }
}
