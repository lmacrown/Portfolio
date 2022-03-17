package com.test.service.post;

import com.test.dao.PostDao;
import com.test.dto.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostServiceImp implements PostService {
    @Autowired
    PostDao postDao;

//    @Override
//    public void insertPost(String img,    String count, String getDate,
//                             String title, String content) {
//        System.out.println("post " +  img + "," + count + "," +
//                                        getDate + "," + title + "," + content);
//        postDao.insertPost(img,count,getDate,title,content);
//    }

    @Override
    public void insertPost(PostDto postDto){
        System.out.println("Start insert post service");
        postDao.insertPost(postDto);
        System.out.println("End insert post service");
    }

    @Override
    public void deletePost(String postNo) {
        postDao.deletePost(postNo);
    }

    @Override
    public ArrayList<PostDto> readBasicDataList() {
        return postDao.readBasicDataList();
    }

    @Override
    public PostDto readBasicDataByPostNo(String postNo) {
        return postDao.readBasicDataByPostNo(postNo);
    }

    @Override
    public void updatePost(String postNo, PostDto postDto){
        postDao.updatePost(postNo, postDto);
    }
}