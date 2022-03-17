package com.test.controller;

import com.test.dto.UserLoginDto;
import com.test.service.userLogin.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/login")
    public String userLogin(){
        try{
            System.out.println("Start userLogin");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "login";
    }

    @PostMapping("/login")
    public String userCheck(HttpSession session,
                            @RequestParam(value="userEmail") String userEmail,
                            @RequestParam(value="userPw") String userPw) {
        try {
            System.out.print("UserLoginController userCheck\n");
            ArrayList<UserLoginDto> userInfo = userLoginService.getLoginInfo();
            UserLoginDto result = userInfo.get(0);
            if (userEmail.equals(result.getEmail()) && userPw.equals(result.getPw())) {
                session.setAttribute("userLogin", result);
                return "redirect:/";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        try{
            System.out.println("user logout");
            session.removeAttribute("userLogin");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/index";
    }
}