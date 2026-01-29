package com.car.service.impl;

import com.car.dto.ReviewsDto;
import com.car.entity.ReviewsEntity;
import com.car.repoistory.ReviewRepository;
import com.car.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    final ReviewRepository repository;
    final ModelMapper mapper;

    @Override
    public void add(ReviewsDto reviewsDto) {
       repository.save(mapper.map(reviewsDto, ReviewsEntity.class));
    }

    @Override
    public void update(ReviewsDto reviewsDto) {
        repository.save(mapper.map(reviewsDto, ReviewsEntity.class));
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<ReviewsDto> getAll() {
        List<ReviewsEntity> reviewsEntities = repository.findAll();
        List<ReviewsDto> reviewsDtos = new ArrayList<>();
        reviewsEntities.forEach(reviewsEntity -> {
            reviewsDtos.add(mapper.map(reviewsEntity, ReviewsDto.class));
        });
        return reviewsDtos;
    }

    @Override
    public List<ReviewsDto> getAllByRating(Integer rating) {
        List<ReviewsEntity> reviewsEntities = repository.findAllByRating(rating);
        List<ReviewsDto> reviewsDtos = new ArrayList<>();
        reviewsEntities.forEach(reviewsEntity -> {
            reviewsDtos.add(mapper.map(reviewsEntity, ReviewsDto.class));
        });
        return reviewsDtos;
    }
}
