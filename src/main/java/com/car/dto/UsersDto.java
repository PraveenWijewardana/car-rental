package com.car.dto;

import com.car.util.UserRole;

import java.util.Date;

public class UsersDto {
    private String id;
    private String fullName;
    private String email;
    private String hashPassword;
    private UserRole role;
    private String phone;
    private Date createdAt;
}
