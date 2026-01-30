package com.car.service.impl;

import com.car.dto.PaymentsDTO;
import com.car.entity.PaymentsEntity;
import com.car.repoistory.PaymentsRepository;
import com.car.service.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentsServiceImpl implements PaymentsService {

    private final PaymentsRepository paymentsRepository;
    
    @Override
    public void add(PaymentsDTO paymentsDTO) {
        if (paymentsDTO == null) {
            return;
        }
        PaymentsEntity entity = mapToEntity(paymentsDTO);
        paymentsRepository.save(entity);
    }

    @Override
    public void update(PaymentsDTO paymentsDTO) {
        if (paymentsDTO == null || paymentsDTO.getPaymentId() == null) {
            return;
        }
        PaymentsEntity entity = mapToEntity(paymentsDTO);
        paymentsRepository.save(entity);
    }

    @Override
    public void delete(String paymentId) {
        if (paymentId != null && !paymentId.isEmpty()) {
            paymentsRepository.deleteById(paymentId);
        }
    }

    @Override
    public PaymentsDTO findById(String paymentId) {
        if (paymentId == null || paymentId.isEmpty()) {
            return null;
        }
        return paymentsRepository.findById(paymentId)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<PaymentsDTO> getAll() {
        return paymentsRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PaymentsDTO> findByBookingId(String bookingId) {
        if (bookingId == null || bookingId.isEmpty()) {
            return List.of();
        }
        return paymentsRepository.findAll()
                .stream()
                .filter(p -> bookingId.equals(p.getBookingId()))
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PaymentsDTO> findByStatus(String paymentStatus) {
        if (paymentStatus == null || paymentStatus.isEmpty()) {
            return List.of();
        }
        return paymentsRepository.findAll()
                .stream()
                .filter(p -> paymentStatus.equals(p.getPaymentStatus()))
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private PaymentsEntity mapToEntity(PaymentsDTO dto) {
        PaymentsEntity entity = new PaymentsEntity();
        entity.setPaymentId(dto.getPaymentId());
        entity.setBookingId(dto.getBookingId());
        entity.setAmount(dto.getAmount());
        entity.setPaymentMethod(dto.getPaymentMethod());
        entity.setPaymentStatus(dto.getPaymentStatus());
        entity.setTransactionId(dto.getTransactionId());
        entity.setPaymentDate(dto.getPaymentDate());
        return entity;
    }

    private PaymentsDTO convertToDTO(PaymentsEntity entity) {
        PaymentsDTO dto = new PaymentsDTO();
        dto.setPaymentId(entity.getPaymentId());
        dto.setBookingId(entity.getBookingId());
        dto.setAmount(entity.getAmount());
        dto.setPaymentMethod(entity.getPaymentMethod());
        dto.setPaymentStatus(entity.getPaymentStatus());
        dto.setTransactionId(entity.getTransactionId());
        dto.setPaymentDate(entity.getPaymentDate());
        return dto;
    }
}
