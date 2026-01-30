package com.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class ReviewsDto {
    private String id;
    private String userId;
    private String carId;
    private Integer rating;
    private String comment;
    private Date date;
}
