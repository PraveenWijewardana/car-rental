package com.car.service;

import com.car.dto.ReviewsDto;

import java.util.List;

public interface ReviewService {
    void add(ReviewsDto reviewsDto);
    void update(ReviewsDto reviewsDto);
    void deleteById(String id);
    List<ReviewsDto> getAll();
    List<ReviewsDto> getAllByRating(Integer rating);
}
