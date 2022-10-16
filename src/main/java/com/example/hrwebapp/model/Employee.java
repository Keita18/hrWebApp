package com.example.hrwebapp.model;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
}
