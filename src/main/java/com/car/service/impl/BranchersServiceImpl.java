package com.car.service.impl;

import com.car.dto.BranchersDTO;
import com.car.entity.BranchesEntity;
import com.car.repoistory.BranchersRepository;
import com.car.service.BranchersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BranchersServiceImpl implements BranchersService {

    private final BranchersRepository branchersRepository;

    @Override
    public void add(BranchersDTO branchersDTO) {
        if (branchersDTO == null) {
            return;
        }
        BranchesEntity entity = mapToEntity(branchersDTO);
        branchersRepository.save(entity);
    }

    @Override
    public void update(BranchersDTO branchersDTO) {
        if (branchersDTO == null || branchersDTO.getBranchId() == null) {
            return;
        }
        BranchesEntity entity = mapToEntity(branchersDTO);
        branchersRepository.save(entity);
    }

    @Override
    public void delete(String branchId) {
        if (branchId != null && !branchId.isEmpty()) {
            branchersRepository.deleteById(branchId);
        }
    }

    @Override
    public BranchersDTO findById(String branchId) {
        if (branchId == null || branchId.isEmpty()) {
            return null;
        }
        return branchersRepository.findById(branchId)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public BranchersDTO findByName(String branchName) {
        if (branchName == null || branchName.isEmpty()) {
            return null;
        }
        return branchersRepository.findAll()
                .stream()
                .filter(b -> branchName.equals(b.getBranchName()))
                .findFirst()
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<BranchersDTO> getAll() {
        return branchersRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BranchersDTO> findByCity(String city) {
        if (city == null || city.isEmpty()) {
            return List.of();
        }
        return branchersRepository.findAll()
                .stream()
                .filter(b -> city.equals(b.getCity()))
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private BranchesEntity mapToEntity(BranchersDTO dto) {
        BranchesEntity entity = new BranchesEntity();
        entity.setBranchId(dto.getBranchId());
        entity.setBranchName(dto.getBranchName());
        entity.setAddress(dto.getAddress());
        entity.setCity(dto.getCity());
        return entity;
    }

    private BranchersDTO convertToDTO(BranchesEntity entity) {
        BranchersDTO dto = new BranchersDTO();
        dto.setBranchId(entity.getBranchId());
        dto.setBranchName(entity.getBranchName());
        dto.setAddress(entity.getAddress());
        dto.setCity(entity.getCity());
        return dto;
    }
}
