package com.scaler.userauthenticationservice.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Roles extends BaseModel {

    private String roleName;

}
