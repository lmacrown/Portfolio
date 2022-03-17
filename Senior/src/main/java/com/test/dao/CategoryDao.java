package com.test.dao;

import com.test.dto.CategoryDto;
import com.test.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CategoryDao {
    @Autowired
    SqlSession sqlSession;


 /*  public void insertCategory(String img, String count, String getDate,
                             String title, String content){
       try{
           CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);

            System.out.println("dao: " + count + "," + getDate + "," + title + "," + content + "," + img );
            categoryMapper.insertCategory(img, count, getDate, title, content);
       }catch (Exception e){
           e.printStackTrace();
        }
   }*/

    public void insertCategory(CategoryDto categoryDto){
        System.out.println("Start insert category dao");
        try {
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            categoryMapper.insertCategory(categoryDto);

        }catch(Exception e){

        }
    }//제거항목


    public void deleteCategory(String categoryNo) {
        try {
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            System.out.println("dao: " + categoryNo);
            categoryMapper.deleteCategory(categoryNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<CategoryDto> readBasicDataList(){
        try {
            System.out.println("calling Category list do");
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            ArrayList<CategoryDto> categoryInfoList = categoryMapper.readBasicDataList();
            System.out.println("calling Category list end");
            return categoryInfoList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CategoryDto readBasicDataByCategoryNo(String categoryNo){
        try {
            System.out.println("calling Category do");
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            CategoryDto category = categoryMapper.readBasicDataByCategoryNo(categoryNo);
            System.out.println("calling Category end");
            return category;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateCategory(String categoryNo, CategoryDto categoryDto){
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        categoryMapper.updateCategory(categoryNo, categoryDto);
    }

}