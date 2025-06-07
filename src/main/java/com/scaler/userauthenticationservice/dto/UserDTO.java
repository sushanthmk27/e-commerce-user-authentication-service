package com.scaler.userauthenticationservice.dto;

import com.scaler.userauthenticationservice.enums.State;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private long id;

    private Date createdAt;

    private Date lastUpdatedAt;

    private String updatedBy;

    private State state;

    private String username;

    private String email;

    private long phoneNumber;

    private List<RolesDTO> roles;
}