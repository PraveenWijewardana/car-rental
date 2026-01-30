package com.car.repoistory;

import com.car.entity.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewsEntity,String> {
    List<ReviewsEntity> findAllByRating(Integer rating);
}
