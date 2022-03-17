package com.test.dao;

import com.test.dto.UserLoginDto;
import com.test.mapper.UserLoginMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserLoginDao {
    @Autowired
    SqlSession sqlSession;

    public ArrayList<UserLoginDto> getLoginInfo() {
        try {
            System.out.println("UserLoginDao getLoginInfo");
            UserLoginMapper userLoginMapper = sqlSession.getMapper(UserLoginMapper.class);
            ArrayList<UserLoginDto> loginInfo = userLoginMapper.getLoginInfo();
            return loginInfo;

        } catch (Exception e) {
            return null;

        }
    }
}