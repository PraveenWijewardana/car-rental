package com.car.dto;

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
    private String brand;
    private String model;
    private String licensePlate;
    private String fuelType;
    private Integer seatCapacity;
    private Double pricePerDay;
    private Boolean isActive;
}
