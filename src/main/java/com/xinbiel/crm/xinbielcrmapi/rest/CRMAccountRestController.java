package com.xinbiel.crm.xinbielcrmapi.rest;

import com.xinbiel.crm.xinbielcrmapi.domains.CreateAccountRequestDTO;
import com.xinbiel.crm.xinbielcrmapi.entities.Account;
import com.xinbiel.crm.xinbielcrmapi.services.CRMAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CRMAccountRestController {

    @Autowired
    private CRMAccountService service;

    @PostMapping("/account")
    public Account createAccount(@RequestBody CreateAccountRequestDTO request) {
        return service.createAccount(request);
    }
}
