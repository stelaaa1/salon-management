package com.example.stel.service.impl;

import com.example.stel.model.Salon;
import com.example.stel.payload.dto.SalonDTO;
import com.example.stel.payload.dto.UserDTO;
import com.example.stel.repository.SalonRepository;
import com.example.stel.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.stel.repository.SalonRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalonServiceImpl implements SalonService {

    private final SalonRepository salonRepository;

    @Override
    public Salon createSalon(SalonDTO req, UserDTO user) {
        Salon salon=new Salon();
        salon.setName(req.getName());
        salon.setAddress(req.getAddress());
        salon.setCity(req.getCity());
        salon.setEmail(req.getEmail());
        salon.setImages(req.getImages());
        salon.setOwnerId(req.getOwnerId());
        salon.setCloseTime(req.getCloseTime());
        salon.setPhoneNumber(req.getPhoneNumber());

        return salonRepository.save(salon);

    }

    @Override
    public Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception {
        Salon existingSalon=salonRepository.findById(salonId).orElse(null);
        if(existingSalon!=null && salon.getOwnerId().equals(user.getId())){
            existingSalon.setCity(salon.getCity());
            existingSalon.setName(salon.getName());
            existingSalon.setOwnerId(user.getId());
            existingSalon.setEmail(salon.getEmail());
            existingSalon.setAddress(salon.getAddress());
            existingSalon.setCloseTime(salon.getCloseTime());
            existingSalon.setPhoneNumber(salon.getPhoneNumber());
            existingSalon.setImages(salon.getImages());
            existingSalon.setOpenTime(salon.getOpenTime());

    }
    throw new Exception("salon not exist");
}

    @Override
    public List<Salon> getAllSalons() {
//        return List.of();
        return salonRepository.findAll();
    }

    @Override
    public Salon getSalonById(Long salonId) throws Exception {

        Salon salon= salonRepository.findById(salonId).orElse(null);
        if(salon==null){
            throw new Exception("salon not exist");
        }
        return salon;
    }

    @Override
    public Salon getSalonByOwnerId(Long ownerId) {
       return salonRepository.findByOwnerId(ownerId);
    }

    @Override
    public List<Salon> searchSalonByCity(String city) {
        return salonRepository.searchSalons(city);
    }
}
