package com.test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDto {
    String userEmail;
    String userPw;
    String userNick;
    public String getEmail(){return userEmail;}
    public String getPw(){
        return userPw;
    }
}