package com.stel.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data

public class ServiceOffering {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String description;

    @Column(nullable=false)
    private int price;

    @Column(nullable=false)
    private String duration;

    @Column(nullable=false)
    private int city;


    private Long salonId;

    @Column(nullable=false)
    private Long categoryId;


    private String image;


}
