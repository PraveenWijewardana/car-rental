package com.car.controller;

import com.car.dto.BookingExtrasDTO;
import com.car.service.BookingExtrasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookingExtras")
@RequiredArgsConstructor
public class BookingExtrasController {

    final BookingExtrasService bookingExtrasService;

    @PostMapping("/add")
    public void addBookingExtras(BookingExtrasDTO bookingExtras) {
        bookingExtrasService.addBookingExtras(bookingExtras);
    }

    @PostMapping("/update")
    public void updateBookingExtras(BookingExtrasDTO bookingExtras) {
        bookingExtrasService.updateBookingExtras(bookingExtras);
    }

    @DeleteMapping("/delet")
    public void deleteBookingExtras(Integer id) {
        bookingExtrasService.deleteBookingExtras(id);
    }

    @GetMapping("/search-booking-id/{id}")
    public void searchByBookingId(Integer id) {
        bookingExtrasService.findByBookingId(id);
    }

    @GetMapping("/search-service-id/{id}")
    public void searchByServiceId(Integer id) {
        bookingExtrasService.findByServiceId(id);
    }

    @GetMapping("/get-all-extras")
    public void getAll(){
        bookingExtrasService.getAll();
    }
}
