package com.xinbiel.crm.xinbielcrmapi.services;

import com.xinbiel.crm.xinbielcrmapi.domains.CreateAccountRequestDTO;
import com.xinbiel.crm.xinbielcrmapi.entities.Account;
import com.xinbiel.crm.xinbielcrmapi.builders.AccountBuilder;
import com.xinbiel.crm.xinbielcrmapi.entities.AccountDetails;
import com.xinbiel.crm.xinbielcrmapi.builders.AccountDetailsBuilder;
import com.xinbiel.crm.xinbielcrmapi.exceptions.CRMAccountNotUniqueEmailException;
import com.xinbiel.crm.xinbielcrmapi.repositories.AccountDetailsRepository;
import com.xinbiel.crm.xinbielcrmapi.repositories.AccountRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class CRMAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    public Account createAccount(CreateAccountRequestDTO request) {
        String firstName = request.getFirstName();
        String lastName = request.getLastName();
        String email = request.getEmail();
        String salt = generateSalt();
        String password = generatePassword(request.getPassword(), salt);
        LocalDate dob = request.getDob();
        char gender = request.getGender();
        String roleCd = request.getRoleCd();


        Account account = accountRepository.findByEmail(email);
        if(account != null) {
            throw new CRMAccountNotUniqueEmailException("Email already exist!");
        }

        AccountDetails details = new AccountDetailsBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setDob(dob)
                .setMemberSince(LocalDateTime.now())
                .build();

        account = new AccountBuilder()
                .setEmail(email)
                .setSalt(salt)
                .setPassword(password)
                .setRoleCd(roleCd)
                .setActive(true)
                .setAccountDetails(details)
                .build();

        accountRepository.save(account);

        return account;
    }

    private String generateSalt() {
        // Possible characters on a salt:
        String chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!@#$%^&*()-_=+";
        StringBuilder salt = new StringBuilder();
        Random random = new Random();

        // Salt will consist of 10 characters total
        for(int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(chars.length());
            salt.append(chars.charAt(randomIndex));
        }
        return salt.toString();
    }

    private String generatePassword(String password, String salt) {
        return new DigestUtils(MessageDigestAlgorithms.SHA_256).digestAsHex(password + salt);
    }


}
