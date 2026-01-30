package com.car.dto;

import com.car.util.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class UsersDto {
    private String id;
    private String fullName;
    private String email;
    private String hashPassword;
    private UserRole role;
    private String phone;
    private Date createdAt;
}
