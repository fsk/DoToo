package com.doto.doto.mapper;

import com.doto.doto.documents.Account;
import com.doto.doto.dto.documents.AccountDto;
import com.doto.doto.dto.request.CreateAccountRequest;

import java.util.Objects;

public class AccountMapper {

    public static Account toDocuments(AccountDto accountDto){
        if (Objects.isNull(accountDto))
            return null;

        return Account.builder()
                .id(accountDto.getId())
                .name(accountDto.getName())
                .surname(accountDto.getSurname())
                .userName(accountDto.getUserName())
                .email(accountDto.getEmail())
                .password(accountDto.getPasssword())
                .build();
    }

    public static AccountDto toDto(Account account){
        if(Objects.isNull(account))
            return null;

        return AccountDto.builder()
                .id(account.getId())
                .name(account.getName())
                .surname(account.getSurname())
                .userName(account.getUserName())
                .email(account.getEmail())
                .passsword(account.getPassword())
                .build();
    }

    public static Account toDocumentsFromCreateAccountDto(CreateAccountRequest createAccountRequest){
        if(Objects.isNull(createAccountRequest))
            return null;

        return Account.builder()
                .id(createAccountRequest.getId())
                .name(createAccountRequest.getName())
                .surname(createAccountRequest.getSurname())
                .userName(createAccountRequest.getUserName())
                .email(createAccountRequest.getEmail())
                .password(createAccountRequest.getPassword())
                .build();
    }
}
