package com.car.repoistory;

import com.car.dto.BookingExtrasDTO;
import com.car.entity.BookingExtrasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingExtrasRepository extends JpaRepository<BookingExtrasEntity, Integer> {
}
