package com.car.service.impl;

import com.car.dto.CarDto;
import com.car.entity.CarEntity;
import com.car.repoistory.CarRepository;
import com.car.service.CarService;
import com.car.util.BookingStatus;
import com.car.util.CarTransmission;
import com.car.util.FuelType;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    final ModelMapper mapper;
    final CarRepository repository;

    @Override
    public void add(CarDto carDto) {
        repository.save(mapper.map(carDto, CarEntity.class));
    }

    @Override
    public void update(CarDto carDto) {
        repository.save(mapper.map(carDto, CarEntity.class));
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<CarDto> getAll() {
        List<CarEntity> carEntities = repository.findAll();
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public List<CarDto> getAllByCategorie(String cat) {
        List<CarEntity> carEntities = repository.getAllByCategoryId(cat);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public List<CarDto> getAllByModel(String model) {
        List<CarEntity> carEntities = repository.getAllByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public List<CarDto> getAllByFuel(FuelType fuelType) {
        List<CarEntity> carEntities = repository.getAllByFuelType(fuelType);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public List<CarDto> findAllBySeatCapacity(Integer capacity) {
        return null;
    }

    @Override
    public List<CarDto> findAllByPrice(Double price) {
        List<CarEntity> carEntities = repository.findAllByPricePerDayLessThanEqual(price);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public List<CarDto> findAllByStatus(Boolean status) {
        List<CarEntity> carEntities = repository.findByIsActive(status);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }

    @Override
    public CarDto findByLicence(String licence) {
        return mapper.map(repository.findByLicensePlate(licence),CarDto.class);
    }

    @Override
    public List<CarDto> findAllByTransmission(CarTransmission transmission) {
        List<CarEntity> carEntities = repository.findByTransmission(transmission);
        List<CarDto> carDtos = new ArrayList<>();
        carEntities.forEach(carEntity -> {
            carDtos.add(mapper.map(carEntity, CarDto.class));
        });
        return carDtos;
    }
}
