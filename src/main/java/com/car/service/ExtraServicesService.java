package com.car.service;

import com.car.dto.ExtraServicesDTO;

import java.util.List;

public interface ExtraServicesService {
    void add(ExtraServicesDTO extraServicesDTO);
    void update(ExtraServicesDTO extraServicesDTO);
    void delete(String serviceId);
    ExtraServicesDTO findById(String serviceId);
    ExtraServicesDTO findByName(String serviceName);
    List<ExtraServicesDTO> getAll();
}
