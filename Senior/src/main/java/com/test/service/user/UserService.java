package com.test.service.user;

import com.test.dto.UserDto;
import com.test.dto.UserInsertDto;

import  java.util.ArrayList;

public interface UserService {

    void insertUser(UserDto userDto);
    void deleteUser(String userNo);
    //void updateUser(String userNo, UserDto userDto);

    ArrayList<UserDto> readUserInfoList();
    UserDto readUserInfoListByUserNo(String userNo);
    UserDto readUserInfoListByUserEmail(String userEmail);

    int checkUserEmailExists(String userEmail);
}