package com.test.controller;

import com.test.dto.PostDto;
import com.test.dto.UserDto;
import com.test.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class PostController {

    @Autowired
    ServletContext servletContext;

    @Autowired
    PostService postService;

    @GetMapping("admin/post/post-table")
    public String post_manage(Model model){
        try{
            System.out.println("Start manage_post");
            ArrayList<PostDto> postDto = postService.readBasicDataList();
            model.addAttribute("postData",postDto);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/post/post-table";
    }

    @GetMapping("postpage")
    public String add_post(Model model){
        try{
            System.out.println("Start manage_post");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/post/form";
    }// 배너

    @PostMapping(value = "/addpost")
    public String insert_post(PostDto postDto,
                              UserDto userDto,
                              MultipartFile postImage,
                              HttpServletRequest request) throws IOException {

        System.out.println(postDto.getPostTitle());
        System.out.println(postDto.getPostContents());

        //String postCount = "0";

        //set post count
        postDto.setPostCount("0");

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateForImage = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String date = sdf.format(d);
        String dateForImg = dateForImage.format(d);

        dateForImg = dateForImg.replace('.','_');
        dateForImg = dateForImg.replace(':','_');

        String webappRoot = servletContext.getRealPath("/");
        String relativeFolder =  "/files/postImage/";

        System.out.println(webappRoot);
        System.out.println(relativeFolder);

        String filename = webappRoot + relativeFolder + dateForImg + postImage.getOriginalFilename();
        String postFileName = relativeFolder + dateForImg +postImage.getOriginalFilename();

        //set post file
        postDto.setPostImg(postFileName);

        //set reg date
        postDto.setPostRegDate(date);
        FileCopyUtils.copy(postImage.getBytes(), new File(filename));

        System.out.println(postDto.getPostImg());
        System.out.println(postDto.getPostCount());
        System.out.println(postDto.getPostRegDate());
        System.out.println(postDto.getPostTitle());
        System.out.println(postDto.getPostContents());



        postService.insertPost(postDto);

        return "redirect:/";
    }

    @RequestMapping(value = "/admin/post/post-delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "postNo") String postNo) {

        try {
            System.out.println("postNo: " + postNo);
            postService.deletePost(postNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/post/post-table";
    }

    @GetMapping("/admin/post/post-edit")
    public String update_post_form(@RequestParam(value = "postNo") String postNo,  Model model) {
        System.out.println("Start update lecture form");

        try {
            PostDto postDto = postService.readBasicDataByPostNo(postNo);
            model.addAttribute("post",postDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/post/edit";
    }

    @RequestMapping(value = "/admin/editPost", method = {RequestMethod.POST, RequestMethod.GET})
    public String update_post(@RequestParam(value = "postNo") String postNo,
                              PostDto postDto, MultipartFile postImage,
                              Model model) {
        System.out.println("Start update lecture");

        try {
            PostDto postInDb = postService.readBasicDataByPostNo(postNo);
            String fileName = postImage.getOriginalFilename();
            if (fileName.isEmpty()) { // 이미지이름이 빈칸 == 이미지새로 업로드 안함
                System.out.println("editItemWithoutImg");
                postDto.setPostImg(postInDb.getPostImg()); // db에 있던 배너이미지를 그대로 넣어주기


            } else { // 이미지 이름이 있으면 기존이미지 삭제 후 새이미지를 저장
                System.out.println("editItemWithImg");

                File targetFile = new File(servletContext.getRealPath("/") + postInDb.getPostImg()); // 서버에있는 삭제할 배너파일 지정
                String delName = targetFile.getName(); // 삭제될 배너파일이름
                if (targetFile.delete()) {
                    System.out.println("Deleted file : " + delName);
                } else {
                    System.out.println("Failed to delete the file.");
                }

                // 서버에 사진 저장
                String rootPath = servletContext.getRealPath("/");
                String relativeFolder =  "/files/postImage/";
                System.out.println(rootPath + relativeFolder);

                String serverFile = rootPath + relativeFolder + fileName;

                FileCopyUtils.copy(postImage.getBytes(), new File(serverFile)); // 서버에 이미지 저장

                postDto.setPostImg("/files/lectureImage/" + fileName); // 새로운 이미지이름으로 dto객체의 이미지이름 저장
            }

            postDto.setPostRegDate(postInDb.getPostRegDate());
            postDto.setPostCount(postInDb.getPostCount());
            postService.updatePost(postNo, postDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/post/post-table";
    }
}