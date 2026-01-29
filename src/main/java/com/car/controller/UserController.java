package com.car.controller;

import com.car.dto.UsersDto;
import com.car.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    public void add(UsersDto usersDto){
        userService.add(usersDto);
    }
}
