package com.car.controller;

import com.car.dto.CarDto;
import com.car.service.CarService;
import com.car.util.BookingStatus;
import com.car.util.CarTransmission;
import com.car.util.FuelType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CarController {

    final CarService service;

    @PostMapping("/add")
    public void add(@RequestBody CarDto carDto){
        service.add(carDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody CarDto carDto){
        service.update(carDto);
    }

    @DeleteMapping("/delete-by-id")
    public void deleteById(String id){
        service.deleteById(id);
    }

    @GetMapping("/get-all")
    public List<CarDto> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-all-by-category/{cat}")
    public List<CarDto> getAllByCategory(@PathVariable String cat){
        return service.getAllByCategorie(cat);
    }

    @GetMapping("/get-all-by-model/{model}")
    public List<CarDto> getAllByModel(@PathVariable String model){
        return service.getAllByModel(model);
    }

    @GetMapping("/get-all-by-license/{license}")
    public CarDto findByLicense(@PathVariable String license){
        return service.findByLicence(license);
    }
    @GetMapping("/get-all-by-fuel/{fuel}")
    public List<CarDto> findAllByFuelType(@PathVariable FuelType fuel){
        return service.getAllByFuel(fuel);
    }

    @GetMapping("/get-all-by-seat-capacity/{capacity}")
    public List<CarDto> findAllBySeatCapacity(@PathVariable Integer capacity){
        return service.findAllBySeatCapacity(capacity);
    }

    @GetMapping("/get-all-by-price/{price}")
    public List<CarDto> findAllByPrice(@PathVariable Double price){
        return service.findAllByPrice(price);
    }

    @GetMapping("/get-all-by-status/{status}")
    public List<CarDto> findAllByStatus(@PathVariable Boolean status){
        return service.findAllByStatus(status);
    }

    @GetMapping("/get-all-by-transmission/{transmission}")
    public List<CarDto> findAllByTransmission(@PathVariable CarTransmission transmission){
        return service.findAllByTransmission(transmission);
    }

}
