package com.doto.doto.mapper;

import com.doto.doto.documents.Account;
import com.doto.doto.dto.documents.AccountDto;
import com.doto.doto.dto.request.createrequest.CreateAccountRequest;

import java.util.Objects;

public class AccountMapper {

    public static Account toDocuments(AccountDto accountDto){
        if (Objects.isNull(accountDto))
            return null;

        return Account.builder()
                .name(accountDto.getName())
                .surname(accountDto.getSurname())
                .userName(accountDto.getUserName())
                .email(accountDto.getEmail())
                .build();
    }

    public static AccountDto toDto(Account account){
        if(Objects.isNull(account))
            return null;

        return AccountDto.builder()
                .name(account.getName())
                .surname(account.getSurname())
                .userName(account.getUserName())
                .email(account.getEmail())
                .build();
    }

    public static Account toDocumentsFromCreateAccountDto(CreateAccountRequest createAccountRequest){
        if(Objects.isNull(createAccountRequest))
            return null;

        return Account.builder()
                .name(createAccountRequest.getName())
                .surname(createAccountRequest.getSurname())
                .userName(createAccountRequest.getUserName())
                .email(createAccountRequest.getEmail())
                .password(createAccountRequest.getPassword())
                .build();
    }
}
