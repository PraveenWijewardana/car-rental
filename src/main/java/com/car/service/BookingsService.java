package com.car.service;

import com.car.dto.BookingExtrasDTO;
import com.car.dto.BookingsDTO;
import com.car.util.BookingStatus;

import java.time.LocalDate;
import java.util.List;


public interface BookingsService {

    void addBookings(BookingsDTO bookingsDTO);
    void updateBookings(BookingsDTO bookingsDTO);
    void deleteBookings(Integer id);
    BookingExtrasDTO findByBookingsId(Integer id);
    BookingExtrasDTO findByUserId(Integer id);
    BookingExtrasDTO findByCarId(Integer id);
    BookingExtrasDTO findByDate(LocalDate date);
    BookingExtrasDTO findByStatus(BookingStatus bookingStatus);
    List<BookingExtrasDTO> getAll();

}
