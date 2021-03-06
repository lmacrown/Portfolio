package com.test.controller;

import com.test.dto.UserDto;
import com.test.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    ServletContext servletContext;

    @Autowired
    UserService userService;

    @GetMapping("admin/user/user-table")
    public String user_manage(Model model){
        try{
            System.out.println("Start manage_user");
            ArrayList<UserDto> userDto = userService.readUserInfoList();
            model.addAttribute("userData",userDto);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/user/user-table";
    }

    @RequestMapping(value = "/admin/user/user-delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "userNo") String userNo) {

        try {
            System.out.println("userNo: " + userNo);
            userService.deleteUser(userNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/user/user-table";
    }

 /*   @GetMapping("/admin/user/user-edit")
    public String update_user_form(@RequestParam(value = "userNo") String userNo,  Model model) {
        System.out.println("Start update lecture form");

        try {
            UserDto userDto = userService.readBasicDataByUserNo(userNo);
            model.addAttribute("user",userDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/user/edit";
    }*/

   /* @RequestMapping(value = "/admin/editUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String update_user(@RequestParam(value = "userNo") String userNo,
                                UserDto userDto, MultipartFile userImage,
                                Model model) {
        System.out.println("Start update lecture");

        try {
            UserDto userInDb = userService.readBasicDataByUserNo(userNo);
            String fileName = userImage.getOriginalFilename();
            if (fileName.isEmpty()) { // ?????????????????? ?????? == ??????????????? ????????? ??????
                System.out.println("editItemWithoutImg");
                userDto.setUserImg(userInDb.getUserImg()); // db??? ?????? ?????????????????? ????????? ????????????


            } else { // ????????? ????????? ????????? ??????????????? ?????? ??? ??????????????? ??????
                System.out.println("editItemWithImg");

                File targetFile = new File(servletContext.getRealPath("/") + userInDb.getUserImg()); // ??????????????? ????????? ???????????? ??????
                String delName = targetFile.getName(); // ????????? ??????????????????
                if (targetFile.delete()) {
                    System.out.println("Deleted file : " + delName);
                } else {
                    System.out.println("Failed to delete the file.");
                }

                // ????????? ?????? ??????
                String rootPath = servletContext.getRealPath("/");
                String relativeFolder =  "/files/userImage/";
                System.out.println(rootPath + relativeFolder);

                String serverFile = rootPath + relativeFolder + fileName;

                FileCopyUtils.copy(userImage.getBytes(), new File(serverFile)); // ????????? ????????? ??????

                userDto.setUserImg("/files/lectureImage/" + fileName); // ????????? ????????????????????? dto????????? ??????????????? ??????
            }

            userDto.setUserRegDate(userInDb.getUserRegDate());
            userDto.setUserCount(userInDb.getUserCount());
            userService.updateUser(userNo, userDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/user/user-table";
    }*/
}