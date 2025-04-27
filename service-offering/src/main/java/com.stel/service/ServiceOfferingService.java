package com.stel.service;


import com.stel.dto.CategoryDTO;
import com.stel.dto.SalonDTO;
import com.stel.dto.ServiceDTO;
import com.stel.model.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {

 ServiceOffering createService(SalonDTO salonDTO,
                               ServiceDTO serviceDTO,
                               CategoryDTO categoryDTO);

 ServiceOffering updateService(Long serviceId, ServiceOffering service) throws Exception;

 Set<ServiceOffering> getAllServiceBySalonId(Long salonId,Long categoryId);

 Set<ServiceOffering> getServicesByIds(Set<Long> ids);

 ServiceOffering getServiceById(Long id) throws Exception;


}
