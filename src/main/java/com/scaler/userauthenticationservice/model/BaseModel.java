package com.scaler.userauthenticationservice.model;

import com.scaler.userauthenticationservice.enums.State;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date createdAt;

    private Date lastUpdatedAt;

    private String updatedBy;

    private State state;
}
