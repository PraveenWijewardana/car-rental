package com.car.service.impl;

import com.car.dto.UsersDto;
import com.car.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add(UsersDto usersDto) {

    }

    @Override
    public void update(UsersDto usersDto) {

    }

    @Override
    public Boolean login(String un, String pwd) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public UsersDto findById(Integer id) {
        return null;
    }

    @Override
    public UsersDto findByName(String name) {
        return null;
    }

    @Override
    public List<UsersDto> getAll() {
        return List.of();
    }

    @Override
    public List<UsersDto> findAllByName(String name) {
        return List.of();
    }

    @Override
    public List<UsersDto> findAllByRole(String role) {
        return List.of();
    }
}
