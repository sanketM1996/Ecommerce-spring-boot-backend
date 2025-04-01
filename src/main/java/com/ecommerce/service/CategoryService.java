package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.payload.CategoryDTO;
import com.ecommerce.payload.CategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    //    get all Category
    CategoryResponse getAllCategories(Integer pageNumber,Integer pageSize,String sortBy,String sortOrder);

    //    create new Category
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    //delete Category
    CategoryDTO deleteCategory(Long categoryId);

    //update Category
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
