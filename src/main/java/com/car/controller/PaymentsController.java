package com.car.controller;

import com.car.dto.PaymentsDTO;
import com.car.service.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsService paymentsService;

    @GetMapping("/get-all")
    public List<PaymentsDTO> getAllPayments() {
        return paymentsService.getAll();
    }

    @GetMapping("/{paymentId}")
    public PaymentsDTO getPaymentById(@PathVariable String paymentId) {
        return paymentsService.findById(paymentId);
    }

    @GetMapping("/booking/{bookingId}")
    public List<PaymentsDTO> getByBookingId(@PathVariable String bookingId) {
        return paymentsService.findByBookingId(bookingId);
    }

    @GetMapping("/status/{paymentStatus}")
    public List<PaymentsDTO> getByStatus(@PathVariable String paymentStatus) {
        return paymentsService.findByStatus(paymentStatus);
    }

    @GetMapping("/method/{paymentMethod}")
    public List<PaymentsDTO> getByPaymentMethod(@PathVariable String paymentMethod) {
        return List.of();
    }

    @PostMapping("/add")
    public PaymentsDTO addPayment(@RequestBody PaymentsDTO paymentsDTO) {
        paymentsService.add(paymentsDTO);
        return paymentsDTO;
    }

    @PutMapping("/{paymentId}")
    public PaymentsDTO updatePayment(@PathVariable String paymentId, @RequestBody PaymentsDTO paymentsDTO) {
        paymentsService.update(paymentsDTO);
        return paymentsDTO;
    }

    @PutMapping("/{paymentId}/status")
    public PaymentsDTO updatePaymentStatus(@PathVariable String paymentId, @RequestParam String paymentStatus) {
        PaymentsDTO dto = paymentsService.findById(paymentId);
        if (dto != null) {
            dto.setPaymentStatus(paymentStatus);
            paymentsService.update(dto);
        }
        return dto;
    }

    @PutMapping("/{paymentId}/amount")
    public PaymentsDTO updateAmount(@PathVariable String paymentId, @RequestParam Double amount) {
        PaymentsDTO dto = paymentsService.findById(paymentId);
        if (dto != null) {
            dto.setAmount(amount);
            paymentsService.update(dto);
        }
        return dto;
    }

    @PutMapping("/{paymentId}/method")
    public PaymentsDTO updatePaymentMethod(@PathVariable String paymentId, @RequestParam String paymentMethod) {
        PaymentsDTO dto = paymentsService.findById(paymentId);
        if (dto != null) {
            dto.setPaymentMethod(paymentMethod);
            paymentsService.update(dto);
        }
        return dto;
    }

    @DeleteMapping("/{paymentId}")
    public void deletePayment(@PathVariable String paymentId) {
        paymentsService.delete(paymentId);
    }

    @DeleteMapping("/booking/{bookingId}")
    public void deleteByBookingId(@PathVariable String bookingId) {
        paymentsService.delete(bookingId);
    }

    @DeleteMapping("/status/{paymentStatus}")
    public void deleteByStatus(@PathVariable String paymentStatus) {
        paymentsService.delete(paymentStatus);
    }
}
