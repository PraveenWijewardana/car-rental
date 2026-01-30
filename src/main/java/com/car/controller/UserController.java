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
        System.out.println("ty");
    }

    @PostMapping("/update")
    public void update(@RequestBody UsersDto usersDto) {
        userService.add(usersDto);
    }

    @GetMapping("/login/{un}/{pwd}")
    public Boolean login(@PathVariable String un,@PathVariable String pwd) {
        return userService.login(un,pwd);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable String id) {
        userService.delete(id);
    }

    @GetMapping("/find-by-id/{id}")
    public UsersDto findById(@PathVariable String  id) {
        return userService.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public UsersDto findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @GetMapping("/get-all")
    public List<UsersDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/find-all-by-name/{name}")
    public List<UsersDto> findAllByName(@PathVariable String name) {
        return userService.findAllByName(name);
    }

    @GetMapping("/find-all-by-role/{role}")
    public List<UsersDto> findAllByRole(@PathVariable String role) {
        return findAllByRole(role);
    }
}
