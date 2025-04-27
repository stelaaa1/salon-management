package com.stel.payload.response.dto;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class SalonDTO {

    private Long id;

    private String name;

    private List<String> images;

    private String address;

    private String phoneNumber;

    private String email;

    private String city;


    private Long ownerId;

    private LocalTime closeTime;
    private LocalTime openTime;
}
