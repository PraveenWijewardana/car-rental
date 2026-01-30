package com.car.service.impl;

import com.car.dto.BookingExtrasDTO;
import com.car.dto.BookingsDTO;
import com.car.service.BookingsService;
import com.car.util.BookingStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingImpl implements BookingsService {

    @Override
    public void addBookings(BookingsDTO bookingsDTO) {

    }

    @Override
    public void updateBookings(BookingsDTO bookingsDTO) {

    }

    @Override
    public void deleteBookings(Integer id) {

    }

    @Override
    public BookingExtrasDTO findByBookingsId(Integer id) {
        return null;
    }

    @Override
    public BookingExtrasDTO findByUserId(Integer id) {
        return null;
    }

    @Override
    public BookingExtrasDTO findByCarId(Integer id) {
        return null;
    }

    @Override
    public BookingExtrasDTO findByDate(LocalDate date) {
        return null;
    }

    @Override
    public BookingExtrasDTO findByStatus(BookingStatus bookingStatus) {
        return null;
    }

    @Override
    public List<BookingExtrasDTO> getAll() {
        return List.of();
    }
}
