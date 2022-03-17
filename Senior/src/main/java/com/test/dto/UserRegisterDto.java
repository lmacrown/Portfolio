package com.test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterDto {
    String userNo;
    String userNick;
    String userId;
    String userPw;
    String userEmail;
    String userRegDate;
}