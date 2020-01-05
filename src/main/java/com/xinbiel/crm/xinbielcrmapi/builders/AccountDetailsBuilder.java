package com.xinbiel.crm.xinbielcrmapi.builders;

import com.xinbiel.crm.xinbielcrmapi.entities.AccountDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountDetailsBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;
    private LocalDateTime memberSince;

    public AccountDetails build() {
        AccountDetails details = new AccountDetails();
        details.setId(this.id);
        details.setFirstName(this.firstName);
        details.setLastName(this.lastName);
        details.setGender(this.gender);
        details.setDob(this.dob);
        details.setMemberSince(this.memberSince);
        return details;
    }

    public AccountDetailsBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public AccountDetailsBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AccountDetailsBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AccountDetailsBuilder setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public AccountDetailsBuilder setDob(LocalDate dob) {
        this.dob = dob;
        return this;
    }

    public AccountDetailsBuilder setMemberSince(LocalDateTime memberSince) {
        this.memberSince = memberSince;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDateTime getMemberSince() {
        return memberSince;
    }
}
