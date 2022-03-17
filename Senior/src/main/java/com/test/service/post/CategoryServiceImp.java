package com.test.service.post;

import com.test.dao.CategoryDao;
import com.test.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

//    @Override
//    public void insertCategory(String img,    String count, String getDate,
//                             String title, String content) {
//        System.out.println("category " +  img + "," + count + "," +
//                                        getDate + "," + title + "," + content);
//        categoryDao.insertCategory(img,count,getDate,title,content);
//    }

    @Override
    public void insertCategory(CategoryDto categoryDto){
        System.out.println("Start insert category service");
        categoryDao.insertCategory(categoryDto);
        System.out.println("End insert category service");
    }

    @Override
    public void deleteCategory(String categoryNo) {
        categoryDao.deleteCategory(categoryNo);
    }

    @Override
    public ArrayList<CategoryDto> readBasicDataList() {
        return categoryDao.readBasicDataList();
    }

    @Override
    public CategoryDto readBasicDataByCategoryNo(String categoryNo) {
        return categoryDao.readBasicDataByCategoryNo(categoryNo);
    }

    @Override
    public void updateCategory(String categoryNo, CategoryDto categoryDto){
        categoryDao.updateCategory(categoryNo, categoryDto);
    }
}