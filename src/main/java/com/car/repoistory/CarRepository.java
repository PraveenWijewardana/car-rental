package com.car.repoistory;

import com.car.entity.CarEntity;
import com.car.util.CarTransmission;
import com.car.util.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity,String> {
    List<CarEntity> getAllByCategoryId(String categoryId);
    List<CarEntity> getAllByModel(String model);
    List<CarEntity> getAllByFuelType(FuelType fuelType);
    List<CarEntity> findAllByPricePerDayLessThanEqual(Double pricePerDayIsLessThan);
    List<CarEntity> findByIsActive(Boolean isActive);
    List<CarEntity> findByLicensePlate(String licensePlate);
    List<CarEntity> findByTransmission(CarTransmission transmission);
}
