package com.car.service.impl;

import com.car.dto.ExtraServicesDTO;
import com.car.entity.ExtraServicesEntity;
import com.car.repoistory.ExtraServicesRepository;
import com.car.service.ExtraServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExtraServicesServiceImpl implements ExtraServicesService {

    private final ExtraServicesRepository extraServicesRepository;
    
    @Override
    public void add(ExtraServicesDTO extraServicesDTO) {
        if (extraServicesDTO == null) {
            return;
        }
        ExtraServicesEntity entity = mapToEntity(extraServicesDTO);
        extraServicesRepository.save(entity);
    }

    @Override
    public void update(ExtraServicesDTO extraServicesDTO) {
        if (extraServicesDTO == null || extraServicesDTO.getServiceId() == null) {
            return;
        }
        ExtraServicesEntity entity = mapToEntity(extraServicesDTO);
        extraServicesRepository.save(entity);
    }

    @Override
    public void delete(String serviceId) {
        if (serviceId != null && !serviceId.isEmpty()) {
            extraServicesRepository.deleteById(serviceId);
        }
    }

    @Override
    public ExtraServicesDTO findById(String serviceId) {
        if (serviceId == null || serviceId.isEmpty()) {
            return null;
        }
        return extraServicesRepository.findById(serviceId)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public ExtraServicesDTO findByName(String serviceName) {
        if (serviceName == null || serviceName.isEmpty()) {
            return null;
        }
        return extraServicesRepository.findAll()
                .stream()
                .filter(s -> serviceName.equals(s.getServiceName()))
                .findFirst()
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<ExtraServicesDTO> getAll() {
        return extraServicesRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ExtraServicesEntity mapToEntity(ExtraServicesDTO dto) {
        ExtraServicesEntity entity = new ExtraServicesEntity();
        entity.setServiceId(dto.getServiceId());
        entity.setServiceName(dto.getServiceName());
        entity.setDailyPrice(dto.getDailyPrice());
        return entity;
    }

    private ExtraServicesDTO convertToDTO(ExtraServicesEntity entity) {
        ExtraServicesDTO dto = new ExtraServicesDTO();
        dto.setServiceId(entity.getServiceId());
        dto.setServiceName(entity.getServiceName());
        dto.setDailyPrice(entity.getDailyPrice());
        return dto;
    }
}
