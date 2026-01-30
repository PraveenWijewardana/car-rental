package com.car.service.impl;

import com.car.dto.BookingExtrasDTO;
import com.car.dto.BookingsDTO;
import com.car.entity.BookingsEntity;
import com.car.repoistory.BookingRepository;
import com.car.service.BookingsService;
import com.car.util.BookingStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingImpl implements BookingsService {

    private final BookingRepository bookingRepository;

    @Override
    public void addBookings(BookingsDTO bookingsDTO) {
        if (bookingsDTO == null) {
            return;
        }
        BookingsEntity entity = mapToEntity(bookingsDTO);
        bookingRepository.save(entity);
    }

    @Override
    public void updateBookings(BookingsDTO bookingsDTO) {
        if (bookingsDTO == null || bookingsDTO.getBookingId() == null) {
            return;
        }
        BookingsEntity entity = mapToEntity(bookingsDTO);
        bookingRepository.save(entity);
    }

    @Override
    public void deleteBookings(Integer id) {
        if (id != null) {
            bookingRepository.deleteById(id);
        }
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
    public List<BookingExtrasDTO> getAll() {
        return bookingRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookingsDTO> getAllBookings() {
        return bookingRepository.findAll()
                .stream()
                .map(this::convertBookingToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookingsDTO getBookingById(String bookingId) {
        if (bookingId == null || bookingId.isEmpty()) {
            return null;
        }
        try {
            return bookingRepository.findById(Integer.parseInt(bookingId))
                    .map(this::convertBookingToDTO)
                    .orElse(null);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public List<BookingsDTO> getBookingsByUserId(String userId) {
        if (userId == null || userId.isEmpty()) {
            return List.of();
        }
        return bookingRepository.findAll()
                .stream()
                .filter(b -> userId.equals(b.getUserId()))
                .map(this::convertBookingToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookingsDTO> getBookingsByCarId(String carId) {
        if (carId == null || carId.isEmpty()) {
            return List.of();
        }
        return bookingRepository.findAll()
                .stream()
                .filter(b -> carId.equals(b.getCardId()))
                .map(this::convertBookingToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookingsDTO> getBookingsByStatus(String status) {
        if (status == null || status.isEmpty()) {
            return List.of();
        }
        return bookingRepository.findAll()
                .stream()
                .filter(b -> b.getStatus() != null && status.equals(b.getStatus().toString()))
                .map(this::convertBookingToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookingsDTO> getBookingsByDate(LocalDate date) {
        if (date == null) {
            return List.of();
        }
        java.sql.Date sqlDate = java.sql.Date.valueOf(date);
        return bookingRepository.findAll()
                .stream()
                .filter(b -> b.getStartDate() != null && b.getStartDate().equals(sqlDate))
                .map(this::convertBookingToDTO)
                .collect(Collectors.toList());
    }

    public BookingExtrasDTO addExtraServiceToBooking(String bookingId, String serviceId) {
        if (bookingId == null || serviceId == null) {
            return null;
        }
        BookingExtrasDTO bookingExtrasDTO = new BookingExtrasDTO();
        bookingExtrasDTO.setBookingId(bookingId);
        bookingExtrasDTO.setServiceId(serviceId);
        return bookingExtrasDTO;
    }

    public List<BookingExtrasDTO> getExtrasForBooking(String bookingId) {
        return List.of();
    }

    public void removeExtraServiceFromBooking(String bookingId, String serviceId) {
    }

    private BookingsEntity mapToEntity(BookingsDTO dto) {
        BookingsEntity entity = new BookingsEntity();
        entity.setBookingId(dto.getBookingId());
        entity.setUserId(dto.getUserId());
        entity.setCardId(dto.getCardId());
        entity.setStartDate(dto.getStartDate());
        entity.setEndDate(dto.getEndDate());
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    private BookingExtrasDTO convertToDTO(BookingsEntity entity) {
        BookingExtrasDTO dto = new BookingExtrasDTO();
        return dto;
    }

    private BookingsDTO convertBookingToDTO(BookingsEntity entity) {
        BookingsDTO dto = new BookingsDTO();
        dto.setBookingId(entity.getBookingId());
        dto.setUserId(entity.getUserId());
        dto.setCardId(entity.getCardId());
        dto.setStartDate(entity.getStartDate());
        dto.setEndDate(entity.getEndDate());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setStatus(entity.getStatus());
        return dto;
    }
}
