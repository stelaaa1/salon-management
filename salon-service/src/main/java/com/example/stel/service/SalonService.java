package com.example.stel.service;

import com.example.stel.model.Salon;
import com.example.stel.payload.dto.SalonDTO;
import com.example.stel.payload.dto.UserDTO;
import com.example.stel.repository.SalonRepository;

import java.util.List;

public interface SalonService {
    Salon createSalon(SalonDTO salon, UserDTO user);

Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception;

List<Salon> getAllSalons();
Salon getSalonById(Long salonId) throws Exception;

Salon getSalonByOwnerId(Long ownerId);
List<Salon> searchSalonByCity(String city);

}
