package com.xinbiel.crm.xinbielcrmapi.builders;

import com.xinbiel.crm.xinbielcrmapi.entities.Account;
import com.xinbiel.crm.xinbielcrmapi.entities.AccountDetails;

public class AccountBuilder {
    private int id;
    private String salt;
    private String email;
    private String password;
    private String roleCd;
    private boolean active;
    private AccountDetails accountDetails;

    public Account build() {
        Account account = new Account();
        account.setId(id);
        account.setSalt(salt);
        account.setEmail(email);
        account.setPassword(password);
        account.setRoleCd(roleCd);
        account.setActive(active);
        account.setAccountDetails(accountDetails);
        return account;
    }

    public AccountBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public AccountBuilder setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public AccountBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public AccountBuilder setRoleCd(String roleCd) {
        this.roleCd = roleCd;
        return this;
    }

    public AccountBuilder setActive(boolean active) {
        this.active = active;
        return this;
    }

    public AccountBuilder setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getSalt() {
        return salt;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public boolean isActive() {
        return active;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }
}
