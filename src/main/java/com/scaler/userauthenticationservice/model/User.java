package com.scaler.userauthenticationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel {

    private String username;

    private String password;

    private String email;

    private long phoneNumber;

    @ManyToMany
    private List<Roles> roles;

}
