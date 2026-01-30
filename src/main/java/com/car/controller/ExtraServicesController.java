package com.car.controller;

import com.car.dto.ExtraServicesDTO;
import com.car.service.ExtraServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/extra-services")
@RequiredArgsConstructor
public class ExtraServicesController {

    private final ExtraServicesService extraServicesService;

    @GetMapping("/get-all")
    public List<ExtraServicesDTO> getAllServices() {
        return extraServicesService.getAll();
    }

    @GetMapping("/{serviceId}")
    public ExtraServicesDTO getServiceById(@PathVariable String serviceId) {
        return extraServicesService.findById(serviceId);
    }

    @GetMapping("/name/{serviceName}")
    public ExtraServicesDTO getByName(@PathVariable String serviceName) {
        return extraServicesService.findByName(serviceName);
    }

    @PostMapping("/add")
    public ExtraServicesDTO addService(@RequestBody ExtraServicesDTO extraServicesDTO) {
        extraServicesService.add(extraServicesDTO);
        return extraServicesDTO;
    }

    @PutMapping("/{serviceId}")
    public ExtraServicesDTO updateService(@PathVariable String serviceId, @RequestBody ExtraServicesDTO extraServicesDTO) {
        extraServicesService.update(extraServicesDTO);
        return extraServicesDTO;
    }

    @PutMapping("/{serviceId}/name")
    public ExtraServicesDTO updateServiceName(@PathVariable String serviceId, @RequestParam String serviceName) {
        ExtraServicesDTO dto = extraServicesService.findById(serviceId);
        if (dto != null) {
            dto.setServiceName(serviceName);
            extraServicesService.update(dto);
        }
        return dto;
    }

    @PutMapping("/{serviceId}/price")
    public ExtraServicesDTO updateDailyPrice(@PathVariable String serviceId, @RequestParam Double dailyPrice) {
        ExtraServicesDTO dto = extraServicesService.findById(serviceId);
        if (dto != null) {
            dto.setDailyPrice(dailyPrice);
            extraServicesService.update(dto);
        }
        return dto;
    }

    @DeleteMapping("/{serviceId}")
    public void deleteService(@PathVariable String serviceId) {
        extraServicesService.delete(serviceId);
    }

    @DeleteMapping("/name/{serviceName}")
    public void deleteByName(@PathVariable String serviceName) {
        ExtraServicesDTO dto = extraServicesService.findByName(serviceName);
        if (dto != null) {
            extraServicesService.delete(dto.getServiceId());
        }
    }
}
