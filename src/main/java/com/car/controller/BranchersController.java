package com.car.controller;

import com.car.dto.BranchersDTO;
import com.car.service.BranchersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branchers")
@RequiredArgsConstructor
public class BranchersController {

    private final BranchersService branchersService;

    @GetMapping("/get-all")
    public List<BranchersDTO> getAllBranches() {
        return branchersService.getAll();
    }

    @GetMapping("/{branchId}")
    public BranchersDTO getBranchById(@PathVariable String branchId) {
        return branchersService.findById(branchId);
    }

    @GetMapping("/name/{branchName}")
    public BranchersDTO getByName(@PathVariable String branchName) {
        return branchersService.findByName(branchName);
    }

    @GetMapping("/search")
    public List<BranchersDTO> searchBranches(@RequestParam String keyword) {
        return List.of();
    }

    @PostMapping("/add")
    public BranchersDTO addBranch(@RequestBody BranchersDTO branchersDTO) {
        branchersService.add(branchersDTO);
        return branchersDTO;
    }

    @PutMapping("/{branchId}")
    public BranchersDTO updateBranch(@PathVariable String branchId, @RequestBody BranchersDTO branchersDTO) {
        branchersService.update(branchersDTO);
        return branchersDTO;
    }

    @PutMapping("/{branchId}/name")
    public BranchersDTO updateBranchName(@PathVariable String branchId, @RequestParam String branchName) {
        BranchersDTO dto = branchersService.findById(branchId);
        if (dto != null) {
            dto.setBranchName(branchName);
            branchersService.update(dto);
        }
        return dto;
    }

    @PutMapping("/{branchId}/address")
    public BranchersDTO updateAddress(@PathVariable String branchId, @RequestParam String address) {
        BranchersDTO dto = branchersService.findById(branchId);
        if (dto != null) {
            dto.setAddress(address);
            branchersService.update(dto);
        }
        return dto;
    }

    @PutMapping("/{branchId}/city")
    public BranchersDTO updateCity(@PathVariable String branchId, @RequestParam String city) {
        BranchersDTO dto = branchersService.findById(branchId);
        if (dto != null) {
            dto.setCity(city);
            branchersService.update(dto);
        }
        return dto;
    }

    @DeleteMapping("/{branchId}")
    public void deleteBranch(@PathVariable String branchId) {
        branchersService.delete(branchId);
    }

    @DeleteMapping("/name/{branchName}")
    public void deleteByName(@PathVariable String branchName) {
        BranchersDTO dto = branchersService.findByName(branchName);
        if (dto != null) {
            branchersService.delete(dto.getBranchId());
        }
    }

    @DeleteMapping("/city/{city}")
    public void deleteByCity(@PathVariable String city) {
    }

    @DeleteMapping("/delete-all")
    public void deleteAllBranches() {
    }
}
