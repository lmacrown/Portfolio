package com.test.mapper;

import com.test.dto.UserLoginDto;

import java.util.ArrayList;

public interface UserLoginMapper {
    ArrayList<UserLoginDto> getLoginInfo();
}