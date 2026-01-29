package com.car.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    @PostMapping("/add")
    public void add(){

    }

    @PostMapping("/update")
    public void update(){

    }

    @DeleteMapping("/delete-by-id")
    public void deleteById(){

    }

    @GetMapping("/get-all")
    public void getAll(){

    }

    @GetMapping("/get-all-by-category")
    public void getAllByCategory(){

    }

    @GetMapping("/get-all-by-model")
    public void getAllByModel(){

    }

    @GetMapping("/get-all-by-license")
    public void findByLicense(){

    }
    @GetMapping("/get-all-by-fuel")
    public void findAllByFuelType(){

    }

    @GetMapping("/get-all-by-seat-capacity")
    public void findAllBySeatCapacity(){

    }

    @GetMapping("/get-all-by-price")
    public void findAllByPrice(){

    }

    @GetMapping("/get-all-by-status")
    public void findAllByStatus(){

    }

}
