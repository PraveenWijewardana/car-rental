package com.car.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
