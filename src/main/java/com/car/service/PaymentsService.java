package com.car.service;

import com.car.dto.PaymentsDTO;

import java.util.List;

public interface PaymentsService {
    void add(PaymentsDTO paymentsDTO);
    void update(PaymentsDTO paymentsDTO);
    void delete(String paymentId);
    PaymentsDTO findById(String paymentId);
    List<PaymentsDTO> getAll();
    List<PaymentsDTO> findByBookingId(String bookingId);
    List<PaymentsDTO> findByStatus(String paymentStatus);
}
