package com.test.service.userLogin;

import com.test.dto.UserLoginDto;

import java.util.ArrayList;

public interface UserLoginService {
    ArrayList<UserLoginDto> getLoginInfo();
}