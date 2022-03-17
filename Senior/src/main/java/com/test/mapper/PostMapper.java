package com.test.mapper;

import com.test.dto.PostDto;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface PostMapper {
/*   void insertPost(@Param("img") String img,
                     @Param("count") String count,
                     @Param("regDate") String regDate,
                     @Param("title") String title,
                     @Param("content") String content);*/

    void insertPost(@Param("postDto") PostDto postDto);//제거

    void deletePost(@Param("postNo") String postNo);

    void updatePost(@Param("postNo") String postNo, @Param("updateDto") PostDto postDto);

    ArrayList<PostDto> readBasicDataList();
    PostDto readBasicDataByPostNo(@Param("postNo") String postNo);


}