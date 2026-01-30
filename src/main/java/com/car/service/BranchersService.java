package com.car.service;

import com.car.dto.BranchersDTO;

import java.util.List;

public interface BranchersService {
    void add(BranchersDTO branchersDTO);
    void update(BranchersDTO branchersDTO);
    void delete(String branchId);
    BranchersDTO findById(String branchId);
    BranchersDTO findByName(String branchName);
    List<BranchersDTO> getAll();
    List<BranchersDTO> findByCity(String city);
}
