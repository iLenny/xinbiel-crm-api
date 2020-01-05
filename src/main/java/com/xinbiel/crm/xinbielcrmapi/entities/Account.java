package com.xinbiel.crm.xinbielcrmapi.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "crm_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "salt")
    private String salt;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role_cd")
    private String roleCd;

    @Column(name = "active")
    private boolean active;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;

    public Account() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                active == account.active &&
                Objects.equals(salt, account.salt) &&
                Objects.equals(email, account.email) &&
                Objects.equals(password, account.password) &&
                Objects.equals(roleCd, account.roleCd) &&
                Objects.equals(accountDetails, account.accountDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salt, email, password, roleCd, active, accountDetails);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleCd='" + roleCd + '\'' +
                ", active=" + active +
                ", accountDetails=" + accountDetails +
                '}';
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

    public void setId(int id) {
        this.id = id;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
