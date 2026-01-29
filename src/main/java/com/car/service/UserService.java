package com.car.service;

import com.car.dto.UsersDto;

public interface UserService {
    void add(UsersDto usersDto);
    void update();
    Boolean login(String un , String pwd);
    void delete(Integer id);
    UsersDto findById(Integer id);
    UsersDto findByName(String name);
}
