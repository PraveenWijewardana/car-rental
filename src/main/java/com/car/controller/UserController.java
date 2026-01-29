package com.car.controller;

import com.car.dto.UsersDto;
import com.car.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public void update(@RequestBody UsersDto usersDto) {
        userService.add(usersDto);
    }

    @GetMapping("/login/{un}")
    public Boolean login(String un, String pwd) {
        return userService.login(un,pwd);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id) {

    }

    @GetMapping("/find-by-name")
    public UsersDto findById(Integer id) {
        return null;
    }

    @GetMapping("/find-by-name")
    public UsersDto findByName(String name) {
        return null;
    }

    @GetMapping("/get-all")
    public List<UsersDto> getAll() {
        return List.of();
    }

    @GetMapping("/find-all-by-name")
    public List<UsersDto> findAllByName(String name) {
        return List.of();
    }

    @GetMapping("/find-all-by-role")
    public List<UsersDto> findAllByRole(String role) {
        return List.of();
    }
}
