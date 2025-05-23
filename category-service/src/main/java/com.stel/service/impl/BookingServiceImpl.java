package com.stel.service.impl;

import com.stel.dto.SalonDTO;
import com.stel.model.Category;
import com.stel.repository.CategoryRepository;
import com.stel.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category, SalonDTO salonDTO) {
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setImage(category.getImage());
        newCategory.setSalonId(salonDTO.getId());

        return categoryRepository.save(newCategory);
    }

    @Override
    public Set<Category> getCategoriesBySalon(Long id) {
        return categoryRepository.findBySalonId(id);
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category == null) {
            throw new Exception("Category not exist with id: " + id);
        }
        return category;
    }

    @Override
    public void deleteCategoryById(Long id, Long salonId) throws Exception {
        Category category = getCategoryById(id);

        if (!category.getSalonId().equals(salonId)) {
            throw new Exception("You don't have permission to delete this category");
        }

        categoryRepository.deleteById(id);
    }
}
