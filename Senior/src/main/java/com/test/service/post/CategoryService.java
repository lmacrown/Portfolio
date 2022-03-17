package com.test.service.post;

import com.test.dto.CategoryDto;

import java.util.ArrayList;

public interface CategoryService {
//    void insertCategory(String img, String count, String getDate,
//                      String title, String content);

    void insertCategory(CategoryDto categoryDto);
    ArrayList<CategoryDto> readBasicDataList();

    void deleteCategory(String categoryNo);

    CategoryDto readBasicDataByCategoryNo(String categoryNo);

    void updateCategory(String categoryNo, CategoryDto categoryDto);

}