package com.cybersoft.crm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String roleName;

}
