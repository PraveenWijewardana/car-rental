package com.car.service.impl;

import com.car.config.Config;
import com.car.dto.BookingExtrasDTO;
import com.car.entity.BookingExtrasEntity;
import com.car.repoistory.BookingExtrasRepository;
import com.car.service.BookingExtrasService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingExtrasImpl implements BookingExtrasService {

    private final BookingExtrasRepository repository;
    BookingExtrasDTO bookingExtrasDTO = new BookingExtrasDTO();
    ModelMapper modelMapper = Config.getMapper();

    @Override
    public void addBookingExtras(BookingExtrasDTO bookingExtras){

        repository.save(modelMapper.map(bookingExtras,BookingExtrasEntity.class));

    }

    @Override
    public void updateBookingExtras(BookingExtrasDTO bookingEtras) {

        repository.save(modelMapper.map(bookingEtras,BookingExtrasEntity.class));
    }

    @Override
    public void deleteBookingExtras(Integer id) {

        repository.deleteById(id);
    }

    @Override
    public BookingExtrasDTO findByBookingId(Integer id) {
        BookingExtrasEntity bookingExtrasEntity = repository.findById(id).get();

        bookingExtrasDTO.setBookingId(bookingExtrasEntity.getBookingId());
        bookingExtrasDTO.setServiceId(bookingExtrasEntity.getServiceId());

        return modelMapper.map(bookingExtrasEntity,BookingExtrasDTO.class);
    }

    @Override
    public BookingExtrasDTO findByServiceId(Integer id) {
        BookingExtrasEntity bookingExtrasEntity = repository.findById(id).get();

        bookingExtrasDTO.setBookingId(bookingExtrasEntity.getBookingId());
        bookingExtrasDTO.setServiceId(bookingExtrasEntity.getServiceId());

        return modelMapper.map(bookingExtrasEntity,BookingExtrasDTO.class);
    }

    @Override
    public List<BookingExtrasDTO> getAll() {
        List<BookingExtrasEntity> all = repository.findAll();
        ArrayList<BookingExtrasDTO> bookingExtrasArrayList = new ArrayList<>();
        all.forEach(e -> bookingExtrasArrayList.add(modelMapper.map(e,BookingExtrasDTO.class)));

        return bookingExtrasArrayList;
    }
}
