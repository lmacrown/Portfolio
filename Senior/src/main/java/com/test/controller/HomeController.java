package com.test.controller;

import com.test.dto.*;
import com.test.service.banner.BannerService;
import com.test.service.post.PostService;
import com.test.service.user.UserService;
import com.test.service.userLogin.UserLoginService;
import com.test.util.firebase.FirebaseMessagingSnippets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    FirebaseMessagingSnippets firebaseMessagingSnippets;

    @Autowired
    BannerService bannerService;

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/")
    public String main(Model model){
        try{
            System.out.println("Start main");

            ArrayList<BannerDto> bannerList = bannerService.readBasicDataList();
            ArrayList<PostDto> postList = postService.readBasicDataList();
                    /*ArrayList<UserLoginDto> userInfo = userLoginService.getLoginInfo();
                    model.addAttribute("userLogin", userInfo);*/
                    /*ArrayList<UserDto> userList = userService.readUserInfoList();
                    model.addAttribute("userList", userList);*/
            model.addAttribute("bannerList", bannerList);
            model.addAttribute("postList",postList);
            System.out.println("End main");

        }catch (Exception e){
            e.printStackTrace();
        }
        return "index";
    }

    @GetMapping("/mypage.do")
    public String myPage(Model model){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return "mypage";
    }

    @GetMapping("/userregisterpage.do")
    public String userRegisterPage(Model model){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return "userregisterpage";
    }


    @GetMapping("/postpage.do")
    public String postPage(Model model){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        return "postpage";
    }

}