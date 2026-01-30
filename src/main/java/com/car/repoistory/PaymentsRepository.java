package com.car.repoistory;

import com.car.entity.PaymentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<PaymentsEntity, String> {
}
