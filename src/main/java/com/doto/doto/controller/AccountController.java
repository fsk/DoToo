package com.doto.doto.controller;

import com.doto.doto.dto.documents.AccountDto;
import com.doto.doto.dto.request.CreateAccountRequest;
import com.doto.doto.dto.response.CreateAccountResponse;
import com.doto.doto.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody CreateAccountRequest createAccountRequest){

        return ResponseEntity.ok(accountService.createAccount(createAccountRequest));

    }



}
