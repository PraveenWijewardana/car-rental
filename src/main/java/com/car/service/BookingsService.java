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
    List<BookingExtrasDTO> getAll();
    List<BookingsDTO> getAllBookings();
    BookingsDTO getBookingById(String bookingId);
    List<BookingsDTO> getBookingsByUserId(String userId);
    List<BookingsDTO> getBookingsByCarId(String carId);
    List<BookingsDTO> getBookingsByStatus(String status);
    List<BookingsDTO> getBookingsByDate(LocalDate date);

}
