package com.car.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainteance")
@RequiredArgsConstructor
public class MainteanceController {

    @PostMapping("/add")
    public void add(){

    }

    @PostMapping("/update")
    public void update(){

    }

    @DeleteMapping("/delete-by-id")
    public void deleteById(){

    }

    @GetMapping("/get-all-by-maintenance-date")
    public  void getAllByMaintenanceDate(){

    }

    @GetMapping("/get-all-by-next-maintenance-date")
    public void getAllByNextMaintenanceDate(){

    }

    @GetMapping("/get-all-by-car")
    public void getAllByCar(){

    }

    @GetMapping("/get-by-id")
    public void getById(){

    }
}
