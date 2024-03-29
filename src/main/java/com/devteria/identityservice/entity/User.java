package com.devteria.identityservice.entity;

import com.devteria.identityservice.entity.baseEntity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ma_user")
public class User extends BaseEntity<String> {

    private String username;
    private String passwordJWT;
    private String passwordShow;
    private String fullName;
    private String type;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dob;
    private Set<String> roles;
}
