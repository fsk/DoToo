package com.doto.doto.controller;

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
    public ResponseEntity<CreateAccountResponse> createAccount(@RequestBody CreateAccountRequest createAccountRequest){
        final CreateAccountResponse createAccountResponse =accountService.createAccount(createAccountRequest);
        return ResponseEntity.created(URI.create(createAccountResponse.getId())).body(createAccountResponse);
    }



}
