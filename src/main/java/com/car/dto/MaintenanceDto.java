package com.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class MaintenanceDto {
    private String id;
    private String carId;
    private String dsc;
    private Double cost;
    private Date date;
    private Date nextDueDate;
}
