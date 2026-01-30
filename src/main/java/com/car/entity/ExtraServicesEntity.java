package com.car.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ExtraServicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String serviceId;
    private String serviceName;
    private Double dailyPrice;
}
