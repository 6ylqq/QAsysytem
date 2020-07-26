package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Identity;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int ID;
    private String email;
    private String password;
    private String name;
    private String identity;
    private String collectionAnswer;
    private String goodAnswer;
}
