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
            if (fileName.isEmpty()) { // 이미지이름이 빈칸 == 이미지새로 업로드 안함
                System.out.println("editItemWithoutImg");
                userDto.setUserImg(userInDb.getUserImg()); // db에 있던 배너이미지를 그대로 넣어주기


            } else { // 이미지 이름이 있으면 기존이미지 삭제 후 새이미지를 저장
                System.out.println("editItemWithImg");

                File targetFile = new File(servletContext.getRealPath("/") + userInDb.getUserImg()); // 서버에있는 삭제할 배너파일 지정
                String delName = targetFile.getName(); // 삭제될 배너파일이름
                if (targetFile.delete()) {
                    System.out.println("Deleted file : " + delName);
                } else {
                    System.out.println("Failed to delete the file.");
                }

                // 서버에 사진 저장
                String rootPath = servletContext.getRealPath("/");
                String relativeFolder =  "/files/userImage/";
                System.out.println(rootPath + relativeFolder);

                String serverFile = rootPath + relativeFolder + fileName;

                FileCopyUtils.copy(userImage.getBytes(), new File(serverFile)); // 서버에 이미지 저장

                userDto.setUserImg("/files/lectureImage/" + fileName); // 새로운 이미지이름으로 dto객체의 이미지이름 저장
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