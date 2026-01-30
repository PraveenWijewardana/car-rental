package com.car.controller;

import com.car.dto.BookingExtrasDTO;
import com.car.service.BookingExtrasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookingExtras")
@RequiredArgsConstructor
public class BookingExtrasController {

    final BookingExtrasService bookingExtrasService;

    @PostMapping("/add")
    public void addBookingExtras(@RequestBody BookingExtrasDTO bookingExtras) {
        bookingExtrasService.addBookingExtras(bookingExtras);
    }

    @PostMapping("/update")
    public void updateBookingExtras(@RequestBody BookingExtrasDTO bookingExtras) {
        bookingExtrasService.updateBookingExtras(bookingExtras);
    }

    @DeleteMapping("/delet/{id}")
    public void deleteBookingExtras(@PathVariable Integer id) {
        bookingExtrasService.deleteBookingExtras(id);
    }

    @GetMapping("/search-booking-id/{id}")
    public BookingExtrasDTO searchByBookingId(@PathVariable Integer id) {
        return bookingExtrasService.findByBookingId(id);
    }

    @GetMapping("/search-service-id/{id}")
    public BookingExtrasDTO searchByServiceId(@PathVariable Integer id) {
        return bookingExtrasService.findByServiceId(id);
    }

    @GetMapping("/get-all-extras")
    public List<BookingExtrasDTO> getAll(){
        return bookingExtrasService.getAll();
    }
}
