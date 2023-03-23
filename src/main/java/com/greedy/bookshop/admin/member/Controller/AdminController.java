package com.greedy.bookshop.admin.member.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.greedy.bookshop.admin.member.model.dto.BookDTO;
import com.greedy.bookshop.admin.member.model.service.AdminService;

@Controller
@RequestMapping
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin/product/regist")
	public String productRegistView() {
		
		return "admin/product/productRegist";
	}
	
	/* 상품 등록 */
	@PostMapping("/admin/product/regist")
	public String productRegist(BookDTO book, RedirectAttributes rttr) {
		
		logger.info("productRegistPOST......" + book);

		adminService.bookEnroll(book);
		
		rttr.addFlashAttribute("regist_result", book.getBookName());
		
		return "redirect:/admin/product/productRegist";
	}

}
