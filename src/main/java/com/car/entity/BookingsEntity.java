package com.car.entity;

import com.car.util.BookingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class BookingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String  bookingId;
    private String userId;
    private String cardId;
    private Date startDate;
    private Date endDate;
    private Double totalPrice;
    private BookingStatus status;
}
