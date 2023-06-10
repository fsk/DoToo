package com.doto.doto.mapper;

import com.doto.doto.dto.documents.AccountDto;
import com.doto.doto.dto.response.CreateAccountResponse;

import java.util.Objects;

public class CreateAccountResponseMapper {

    public static CreateAccountResponse toDtoFromAccountDto(AccountDto accountDto){
        if (Objects.isNull(accountDto))
            return null;

        return CreateAccountResponse.builder()
                .id(accountDto.getId())
                .build();
    }
}
