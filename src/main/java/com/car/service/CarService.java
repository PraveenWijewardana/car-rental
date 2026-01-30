package com.car.service;

import com.car.dto.CarDto;
import com.car.util.BookingStatus;
import com.car.util.CarTransmission;
import com.car.util.FuelType;

import java.util.List;

public interface CarService {
    void add(CarDto carDto);
    void update(CarDto carDto);
    void deleteById(String id);
    List<CarDto> getAll();
    List<CarDto> getAllByCategorie(String cat);
    List<CarDto> getAllByModel(String model);
    List<CarDto> getAllByFuel(FuelType fuelType);
    List<CarDto> findAllBySeatCapacity(Integer capacity);
    List<CarDto> findAllByPrice(Double price);
    List<CarDto> findAllByStatus(Boolean status);
    CarDto findByLicence(String licence);
    List<CarDto> findAllByTransmission(CarTransmission transmission);
}
