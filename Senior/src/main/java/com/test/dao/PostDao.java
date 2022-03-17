package com.test.dao;

import com.test.dto.PostDto;
import com.test.mapper.PostMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PostDao {
    @Autowired
    SqlSession sqlSession;


 /*  public void insertPost(String img, String count, String getDate,
                             String title, String content){
       try{
           PostMapper postMapper = sqlSession.getMapper(PostMapper.class);

            System.out.println("dao: " + count + "," + getDate + "," + title + "," + content + "," + img );
            postMapper.insertPost(img, count, getDate, title, content);
       }catch (Exception e){
           e.printStackTrace();
        }
   }*/

    public void insertPost(PostDto postDto){
        System.out.println("Start insert post dao");
        try {
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            postMapper.insertPost(postDto);

        }catch(Exception e){
            e.printStackTrace();
        }
    }//제거항목


    public void deletePost(String postNo) {
        try {
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            System.out.println("dao: " + postNo);
            postMapper.deletePost(postNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PostDto> readBasicDataList(){
        try {
            System.out.println("calling Post list do");
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            ArrayList<PostDto> postInfoList = postMapper.readBasicDataList();
            System.out.println("calling Post list end");
            return postInfoList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public PostDto readBasicDataByPostNo(String postNo){
        try {
            System.out.println("calling Post do");
            PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
            PostDto post = postMapper.readBasicDataByPostNo(postNo);
            System.out.println("calling Post end");
            return post;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updatePost(String postNo, PostDto postDto){
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.updatePost(postNo, postDto);
    }

}