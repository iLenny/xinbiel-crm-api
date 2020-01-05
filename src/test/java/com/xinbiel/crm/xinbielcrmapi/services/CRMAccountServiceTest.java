package com.xinbiel.crm.xinbielcrmapi.services;

import com.xinbiel.crm.xinbielcrmapi.repositories.AccountDetailsRepository;
import com.xinbiel.crm.xinbielcrmapi.repositories.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CRMAccountServiceTest {
    @Mock
    AccountRepository accountRepositoryMock;

    @Mock
    AccountDetailsRepository accountDetailsRepositoryMock;

    @InjectMocks
    CRMAccountService crmAccountServiceMock;
}