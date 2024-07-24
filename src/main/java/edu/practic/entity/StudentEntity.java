package edu.practic.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Setter
@Getter
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
