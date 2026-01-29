package com.car.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MaintenanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String carId;
    private String dsc;
    private Double cost;
    private Date date;
    private Date nextDueDate;
}
