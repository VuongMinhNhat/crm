package com.cybersoft.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int roleId;

    public UserEntity(String email, String password, String firstName, String lastName, int roleId) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
    }
}
