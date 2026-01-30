package com.car.controller;

import com.car.dto.BookingsDTO;
import com.car.service.BookingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingsController {

    final BookingsService bookingsService;

    @PutMapping("/add")
    public void addBooking(@RequestBody BookingsDTO bookingsDTO) {
        bookingsService.addBookings(bookingsDTO);
    }

    @GetMapping("/update")
    public void updateBooking(@RequestBody BookingsDTO bookingsDTO) {
        bookingsService.updateBookings(bookingsDTO);
    }

}
