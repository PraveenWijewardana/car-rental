package com.car.dto;

import com.car.util.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingsDTO {
    private String  bookingId;
    private String userId;
    private String cardId;
    private Date startDate;
    private Date endDate;
    private Double totalPrice;
    private BookingStatus status;
}