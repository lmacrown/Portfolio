package com.test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInsertDto {
    public UserInsertDto(String userNick, String userEmail, String userId, String userPw, String userRegDate) {
        this.userNick = userNick;
        this.userEmail = userEmail;
        this.userId=userId;
        this.userPw = userPw;
        this.userRegDate = userRegDate;
    }
    String userNo;
    String userNick;
    String userId;
    String userEmail;
    String userPw;
    String userRegDate;

}