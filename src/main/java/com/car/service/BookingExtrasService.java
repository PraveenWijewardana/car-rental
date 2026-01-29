package com.car.service;

import com.car.dto.BookingExtrasDTO;
import com.car.dto.BookingsDTO;

import java.util.List;

public interface BookingExtrasService {
    void addBookingExtras(BookingsDTO bookingDTO);
    void updateBookingExtras(BookingsDTO bookingDTO);
    void deleteBookingExtras(Integer id);
    BookingExtrasDTO findByBookingId(Integer id);
    BookingExtrasDTO findByServiceId(Integer id);
    List<BookingExtrasDTO> getAll();
}
