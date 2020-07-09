package com.springboot.example.springbootdemo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String title;


}
