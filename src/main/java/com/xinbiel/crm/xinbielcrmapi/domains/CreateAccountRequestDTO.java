package com.xinbiel.crm.xinbielcrmapi.domains;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreateAccountRequestDTO {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;
    private String email;
    private String password;
    private String roleCd;

    public CreateAccountRequestDTO() {}

    public CreateAccountRequestDTO(String firstName, String lastName, char gender, LocalDate dob, String email, String password, String roleCd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.roleCd = roleCd;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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
}
