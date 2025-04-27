package com.stel.service;

import com.stel.dto.SalonDTO;
import com.stel.model.Category;

import java.util.Set;

public interface CategoryService {

    Category saveCategory(Category category , SalonDTO salonDTO);
    Set<Category> getCategoriesBySalon(Long id);
    Category getCategoryById(Long id) throws Exception;
    void deleteCategoryById(Long id, Long salonId) throws Exception;
}
