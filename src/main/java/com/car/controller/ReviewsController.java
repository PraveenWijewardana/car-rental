package com.car.controller;

import com.car.dto.ReviewsDto;
import com.car.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewsController {

    final ReviewService reviewService;

    @PostMapping("/add")
    public void add(@RequestBody ReviewsDto reviewsDto){
        reviewService.add(reviewsDto);
    }

    @PostMapping("/update")
    public void update(@RequestBody ReviewsDto reviewsDto){
        reviewService.add(reviewsDto);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable String id){
        reviewService.deleteById(id);
    }

    @GetMapping("/get-all")
    public List<ReviewsDto> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/get-all-by-rating")
    public List<ReviewsDto> getAllByRating(Integer rating){
        return reviewService.getAllByRating(rating);
    }
}
