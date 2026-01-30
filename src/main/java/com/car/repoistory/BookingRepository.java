package com.car.repoistory;

import com.car.entity.BookingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingsEntity, Integer> {
}
