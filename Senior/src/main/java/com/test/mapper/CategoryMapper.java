package com.test.mapper;

import com.test.dto.CategoryDto;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface CategoryMapper {
/*   void insertCategory(@Param("img") String img,
                     @Param("count") String count,
                     @Param("regDate") String regDate,
                     @Param("title") String title,
                     @Param("content") String content);*/

    void insertCategory(@Param("categoryDto") CategoryDto categoryDto);//제거

    void deleteCategory(@Param("categoryNo") String categoryNo);

    void updateCategory(@Param("categoryNo") String categoryNo, @Param("updateDto") CategoryDto categoryDto);

    ArrayList<CategoryDto> readBasicDataList();
    CategoryDto readBasicDataByCategoryNo(@Param("categoryNo") String categoryNo);


}