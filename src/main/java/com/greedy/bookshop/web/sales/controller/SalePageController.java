package com.greedy.bookshop.web.sales.controller;


import com.greedy.bookshop.web.sales.model.dto.BookDTO;
import com.greedy.bookshop.web.sales.model.dto.CategoryDTO;
import com.greedy.bookshop.web.sales.model.dto.FileDTO;
import com.greedy.bookshop.web.sales.service.SalePageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Controller
@RequestMapping("web/sale")
public class SalePageController {
    private final SalePageService salePageService;

    public SalePageController(SalePageService salePageService) {
        this.salePageService = salePageService;
    }

    @GetMapping("/salepage")
    public String gosale(Model model) throws IOException {
        log.info("판매페이지로 넘어옴");

        List<CategoryDTO> categoryList = FindSideNav();
        List<BookDTO> bookList = salePageService.selectBookAll();
        List<FileDTO> fileList = salePageService.selectFileAll();

        log.info("값 넘겨줌");
        model.addAttribute("bookList", bookList);
        model.addAttribute("fileList", fileList);
        model.addAttribute("categoryList", categoryList);
        log.info("model : " + model);
        return "web/sale/salepage";
    }

    @GetMapping("/salepage/categoryDetails")
    public String viewSale(@RequestParam long categoryCode, Model model) {
        log.info("categoryCode : " + categoryCode);

        List<CategoryDTO> categoryAll = FindSideNav();
        String CategoryName = salePageService.selectCategoryName(categoryCode);
        List<BookDTO> bookList = salePageService.selectBookCategory(categoryCode);
        List<FileDTO> fileList = new ArrayList<>();
        for (BookDTO b : bookList)
        {
            fileList = salePageService.selectFileCategory(b.getBookCode());
        }
        for (BookDTO b : bookList) log.info("bookCategoryCode : " + b.getCategoryCode());
        log.info("값 넘겨줌");
        model.addAttribute("bookList", bookList);
        model.addAttribute("categoryName",CategoryName);
        model.addAttribute("fileList", fileList);
        model.addAttribute("categoryList", categoryAll);
        return "web/sale/salepage";
    }

    private List<CategoryDTO> FindSideNav()
    {
        List<CategoryDTO> categoryList = salePageService.selectCategoryAll();

        return categoryList;
    }






}
