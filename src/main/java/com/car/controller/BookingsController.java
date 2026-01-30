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

    @GetMapping("/get-all")
    public List<BookingsDTO> getAllBookings() {
        return bookingsService.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public BookingsDTO getBookingById(@PathVariable String bookingId) {
        return bookingsService.getBookingById(bookingId);
    }

    @GetMapping("/user/{userId}")
    public List<BookingsDTO> getByUserId(@PathVariable String userId) {
        return bookingsService.getBookingsByUserId(userId);
    }

    @GetMapping("/car/{cardId}")
    public List<BookingsDTO> getByCarId(@PathVariable String cardId) {
        return bookingsService.getBookingsByCarId(cardId);
    }

    @GetMapping("/status/{status}")
    public List<BookingsDTO> getByStatus(@PathVariable String status) {
        return bookingsService.getBookingsByStatus(status);
    }

    @PostMapping("/add")
    public void addBooking(@RequestBody BookingsDTO bookingsDTO) {
        bookingsService.addBookings(bookingsDTO);
    }

    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable String bookingId) {
        bookingsService.deleteBookings(Integer.parseInt(bookingId));
    }
}
