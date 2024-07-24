package edu.practic.dto;


import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String city;
    private String religion;
    private String zipCode;
    private String email;
    private String motherAndFatherName;
    private Integer phoneNumber;
}
