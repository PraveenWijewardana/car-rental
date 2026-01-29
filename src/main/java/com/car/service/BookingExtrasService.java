package com.car.service;

import com.car.dto.BookingsDTO;

public interface BookingExtrasService {
    void addBookingExtras(BookingsDTO bookingDTO);
    void updateBookingExtras(BookingsDTO bookingDTO);
    void deleteBookingExtras(Integer id);
}
