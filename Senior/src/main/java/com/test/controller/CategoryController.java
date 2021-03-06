package com.test.controller;

import com.test.dto.CategoryDto;
import com.test.service.post.CategoryService;
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
public class CategoryController {

    @Autowired
    ServletContext servletContext;

    @Autowired
    CategoryService categoryService;

    @GetMapping("admin/post/category-table")
    public String category_manage(Model model){
        try{
            System.out.println("Start manage_category");
            ArrayList<CategoryDto> categoryDto = categoryService.readBasicDataList();
            model.addAttribute("categoryData",categoryDto);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "admin/post/category-table";
    }

    @RequestMapping(value = "/admin/post/category-delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "categoryNo") String categoryNo) {

        try {
            System.out.println("categoryNo: " + categoryNo);
            categoryService.deleteCategory(categoryNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/post/category-table";
    }

    @GetMapping("/admin/post/category-edit")
    public String update_category_form(@RequestParam(value = "categoryNo") String categoryNo,  Model model) {
        System.out.println("Start update lecture form");

        try {
            CategoryDto categoryDto = categoryService.readBasicDataByCategoryNo(categoryNo);
            model.addAttribute("category",categoryDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/post/edit";
    }

    @RequestMapping(value = "/admin/editCategory", method = {RequestMethod.POST, RequestMethod.GET})
    public String update_category(@RequestParam(value = "categoryNo") String categoryNo,
                                  CategoryDto categoryDto, MultipartFile categoryImage,
                                  Model model) {
        System.out.println("Start update lecture");

        try {
            CategoryDto categoryInDb = categoryService.readBasicDataByCategoryNo(categoryNo);
            String fileName = categoryImage.getOriginalFilename();
            if (fileName.isEmpty()) { // ?????????????????? ?????? == ??????????????? ????????? ??????
                System.out.println("editItemWithoutImg");
                categoryDto.setCategoryImg(categoryInDb.getCategoryImg()); // db??? ?????? ?????????????????? ????????? ????????????


            } else { // ????????? ????????? ????????? ??????????????? ?????? ??? ??????????????? ??????
                System.out.println("editItemWithImg");

                File targetFile = new File(servletContext.getRealPath("/") + categoryInDb.getCategoryImg()); // ??????????????? ????????? ???????????? ??????
                String delName = targetFile.getName(); // ????????? ??????????????????
                if (targetFile.delete()) {
                    System.out.println("Deleted file : " + delName);
                } else {
                    System.out.println("Failed to delete the file.");
                }

                // ????????? ?????? ??????
                String rootPath = servletContext.getRealPath("/");
                String relativeFolder =  "/files/categoryImage/";
                System.out.println(rootPath + relativeFolder);

                String serverFile = rootPath + relativeFolder + fileName;

                FileCopyUtils.copy(categoryImage.getBytes(), new File(serverFile)); // ????????? ????????? ??????

                categoryDto.setCategoryImg("/files/lectureImage/" + fileName); // ????????? ????????????????????? dto????????? ??????????????? ??????
            }

            categoryDto.setCategoryRegDate(categoryInDb.getCategoryRegDate());
            categoryDto.setCategoryCount(categoryInDb.getCategoryCount());
            categoryService.updateCategory(categoryNo, categoryDto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/post/category-table";
    }
}