package com.test.service.user;

import com.test.dao.UserDao;
import com.test.dto.UserDto;
import com.test.dto.UserInsertDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;


    @Override
    public void deleteUser(String userNo) {
        userDao.deleteUser(userNo);
    }

    @Override
    public ArrayList<UserDto> readUserInfoList() {
        return userDao.readUserInfoList();
    }

    @Override
    public UserDto readUserInfoListByUserNo(String userNo) {
        return userDao.readUserInfoListByUserNo(userNo);
    }

    @Override
    public UserDto readUserInfoListByUserEmail(String userEmail) {
        return userDao.readBasicDataByUserEmail(userEmail);
    }

    @Override
    public void insertUser(UserDto userDto) {
        System.out.println("service insertUser  " + userDto.toString());
        userDao.insertUser(userDto);
        System.out.println("service insertUser success");
    }

   /* @Override
    public void updateUser(String userNo, UserDto userDto){
        userDao.updateUser(userNo, UserDto);
    }*/

    @Override
    public int checkUserEmailExists(String userEmail) {
        if (userDao.readBasicDataByUserEmail(userEmail) != null)
            return 1;
        else
            return 0;
    }

}