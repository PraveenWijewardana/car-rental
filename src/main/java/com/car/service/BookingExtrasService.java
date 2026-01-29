package com.car.service;

import com.car.dto.BookingExtrasDTO;

import java.util.List;

public interface BookingExtrasService {

    void addBookingExtras(BookingExtrasDTO bookingExtras);
    void updateBookingExtras(BookingExtrasDTO bookingDTO);
    void deleteBookingExtras(Integer id);
    BookingExtrasDTO findByBookingId(Integer id);
    BookingExtrasDTO findByServiceId(Integer id);
    List<BookingExtrasDTO> getAll();
}
