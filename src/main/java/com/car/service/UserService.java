package com.car.service;

import com.car.dto.UsersDto;

import java.util.List;

public interface UserService {
    void add(UsersDto usersDto);
    void update(UsersDto usersDto);
    Boolean login(String un , String pwd);
    void delete(Integer id);
    UsersDto findById(Integer id);
    UsersDto findByName(String name);
    List<UsersDto> getAll();
    List<UsersDto> findAllByName(String name);
    List<UsersDto> findAllByRole(String role);
}
