package com.test.service.userLogin;

import com.test.dao.UserLoginDao;
import com.test.dto.UserLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserLoginServiceImp implements UserLoginService {
    @Autowired
    UserLoginDao userLoginDao;

    @Override
    public ArrayList<UserLoginDto> getLoginInfo(){
        System.out.print("UserLoginServiceImp ArrayList\n");
        ArrayList<UserLoginDto> loginInfo = userLoginDao.getLoginInfo();
        return loginInfo;

    }
}