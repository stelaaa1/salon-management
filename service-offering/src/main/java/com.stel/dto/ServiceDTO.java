package com.stel.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ServiceDTO {

    private Long id;

    private String name;


    private String description;


    private int price;


    private String duration;


    private int city;


    private Long salonId;


    private int category;


    private String image;


}
