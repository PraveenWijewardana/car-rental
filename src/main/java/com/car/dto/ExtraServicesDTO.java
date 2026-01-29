package com.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExtraServicesDTO {
    private String serviceId;
    private String serviceName;
    private Double dailyPrice;
}