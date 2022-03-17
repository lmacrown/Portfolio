package com.test.service.post;

import com.test.dto.PostDto;

import java.util.ArrayList;

public interface PostService {
//    void insertPost(String img, String count, String getDate,
//                      String title, String content);

    void insertPost(PostDto postDto);
    ArrayList<PostDto> readBasicDataList();

    void deletePost(String postNo);

    PostDto readBasicDataByPostNo(String postNo);

    void updatePost(String postNo, PostDto postDto);

}