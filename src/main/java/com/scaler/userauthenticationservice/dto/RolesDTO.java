package com.scaler.userauthenticationservice.dto;

import com.scaler.userauthenticationservice.enums.State;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RolesDTO implements Serializable {

    private String roleName;

}