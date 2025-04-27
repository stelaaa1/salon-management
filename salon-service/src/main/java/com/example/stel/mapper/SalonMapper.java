package com.example.stel.mapper;

import com.example.stel.model.Salon;
import com.example.stel.payload.dto.SalonDTO;
import com.example.stel.repository.SalonRepository;

public class SalonMapper {
    public static SalonDTO mapToDTO(Salon salon){
        SalonDTO salonDTO=new SalonDTO();
        salonDTO.setId(salon.getId());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        salonDTO.setName(salon.getName());
        salonDTO.setCity(salon.getCity());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setImages(salon.getImages());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setOwnerId(salon.getOwnerId());

        return salonDTO;

    }
}
