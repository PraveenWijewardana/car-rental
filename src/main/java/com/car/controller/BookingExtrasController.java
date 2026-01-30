package com.car.controller;

import com.car.dto.BookingExtrasDTO;
import com.car.service.BookingExtrasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingExtrasController {

    final BookingExtrasService bookingExtrasService;

    @PostMapping("/{bookingId}/extras")
    public BookingExtrasDTO addExtraServiceToBooking(
            @PathVariable String bookingId,
            @RequestBody BookingExtrasDTO bookingExtrasDTO) {
        bookingExtrasService.addBookingExtras(bookingExtrasDTO);
        return bookingExtrasDTO;
    }

    @GetMapping("/{bookingId}/extras")
    public List<BookingExtrasDTO> getExtrasForBooking(@PathVariable String bookingId) {
        return bookingExtrasService.getAll();
    }

    @DeleteMapping("/{bookingId}/extras/{serviceId}")
    public void removeExtraServiceFromBooking(
            @PathVariable String bookingId,
            @PathVariable String serviceId) {
        bookingExtrasService.deleteBookingExtras(Integer.parseInt(bookingId));
    }

    @PostMapping("/extras/add")
    public void addBookingExtras(@RequestBody BookingExtrasDTO bookingExtras) {
        bookingExtrasService.addBookingExtras(bookingExtras);
    }

    @PostMapping("/extras/update")
    public void updateBookingExtras(@RequestBody BookingExtrasDTO bookingExtras) {
        bookingExtrasService.updateBookingExtras(bookingExtras);
    }

    @GetMapping("/extras/search-booking-id/{id}")
    public BookingExtrasDTO searchByBookingId(@PathVariable Integer id) {
        return bookingExtrasService.findByBookingId(id);
    }

    @GetMapping("/extras/search-service-id/{id}")
    public BookingExtrasDTO searchByServiceId(@PathVariable Integer id) {
        return bookingExtrasService.findByServiceId(id);
    }

    @GetMapping("/extras/get-all")
    public List<BookingExtrasDTO> getAll() {
        return bookingExtrasService.getAll();
    }
}
