package com.car.entity;

import com.car.util.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.Date;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String fullName;
    private String email;
    private String hashPassword;
    private UserRole role;
    private String phone;
    private Date createdAt;
}
