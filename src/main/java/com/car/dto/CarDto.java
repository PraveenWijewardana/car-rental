package com.car.dto;

import com.car.util.CarTransmission;
import com.car.util.FuelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class CarDto {
    private String id;
    private String categoryId;
    private String imgUrl;
    private String brand;
    private String model;
    private String licensePlate;
    private FuelType fuelType;
    private Integer seatCapacity;
    private Double pricePerDay;
    private Boolean isActive;
    private CarTransmission transmission;
}
