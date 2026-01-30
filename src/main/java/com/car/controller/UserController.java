package com.car.controller;

import com.car.dto.UsersDto;
import com.car.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/add")
    public void add(@RequestBody UsersDto usersDto) {
        userService.add(usersDto);
    }

    @PostMapping("/update")
    public void update(UsersDto usersDto) {
        userService.add(usersDto);
    }

    @PostMapping("/login")
    public Boolean login(String un, String pwd) {
        return userService.login(un,pwd);
    }

    @PostMapping("/delete")
    public void delete(Integer id) {

    }

    @PostMapping("/find-by-name")
    public UsersDto findById(Integer id) {
        return null;
    }

    @PostMapping("/find-by-name")
    public UsersDto findByName(String name) {
        return null;
    }

    @PostMapping("/get-all")
    public List<UsersDto> getAll() {
        return List.of();
    }

    @PostMapping("/find-all-by-name")
    public List<UsersDto> findAllByName(String name) {
        return List.of();
    }

    @PostMapping("/find-all-by-role")
    public List<UsersDto> findAllByRole(String role) {
        return List.of();
    }
}
