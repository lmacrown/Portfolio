package com.test.controller;

import com.test.dto.UserLoginDto;
import com.test.service.userLogin.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class UserLoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserLoginService userLoginService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler ) throws Exception{

        System.out.println("Start userLoginInterceptor session");

        HttpSession session = request.getSession(false);
        if (session != null) {
            Object user = session.getAttribute("userLogin");
            System.out.println("session is not null");
            if (user != null) {
                System.out.println("userLogin is not null");
                UserLoginDto userLog = (UserLoginDto) user;
                ArrayList<UserLoginDto> loginInfo=userLoginService.getLoginInfo();
                UserLoginDto result = loginInfo.get(0);

                if (userLog.getEmail().equals(result.getEmail()) &&
                        userLog.getPw().equals(result.getPw())) {
                    return true;
                }
            } else {
                System.out.println("userLogin is null");
            }
        } else {
            System.out.println("session is null");
        }
        response.sendRedirect("/");
        return false;
    }
}