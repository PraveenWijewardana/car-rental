package com.car.repoistory;

import com.car.entity.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<ReviewsEntity, String> {
}
