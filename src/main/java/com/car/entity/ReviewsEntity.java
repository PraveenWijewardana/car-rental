package com.car.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class ReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userId;
    private String carId;
    private Integer rating;
    private String comment;
    private Date date;
}
