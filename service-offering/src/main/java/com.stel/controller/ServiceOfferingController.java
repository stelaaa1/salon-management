package com.stel.controller;

import com.stel.dto.CategoryDTO;
import com.stel.dto.SalonDTO;
import com.stel.dto.ServiceDTO;
import com.stel.model.ServiceOffering;
import com.stel.service.ServiceOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/service-offering/salon-owner")
public class ServiceOfferingController {
    private final ServiceOfferingService serviceOfferingService;

    @PostMapping("/salon/{salonId}")
    public ResponseEntity<ServiceOffering> createService(
            @RequestBody ServiceDTO serviceDTO

    ){
        SalonDTO salonDTO=new SalonDTO();
        salonDTO.setId(1L);

        CategoryDTO categoryDTO=new CategoryDTO();
        categoryDTO.setId((long) serviceDTO.getCategory());

       ServiceOffering serviceOfferings=serviceOfferingService
                .createService(salonDTO,serviceDTO,categoryDTO);
        return  ResponseEntity.ok(serviceOfferings);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ServiceOffering> updateService(
            @PathVariable Long id,
            @RequestBody ServiceOffering serviceOffering

    ) throws Exception {

        ServiceOffering serviceOfferings=serviceOfferingService
                .updateService(id,serviceOffering);
        return  ResponseEntity.ok(serviceOfferings);
    }
}
