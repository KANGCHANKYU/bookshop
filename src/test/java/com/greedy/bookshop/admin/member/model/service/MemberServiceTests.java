package com.greedy.bookshop.admin.member.model.service;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.greedy.bookshop.admin.member.model.dto.MemberDTO;
import com.greedy.bookshop.config.BookshopApplication;


@SpringBootTest //테스트 빈 등록
/* 어플리케이션 설정을 해당 설정 파일에서 가져오겠다는 의미 */
@ContextConfiguration(classes = {BookshopApplication.class})
public class MemberServiceTests {
	
	@Autowired
	private MemberService memberService;
	
	@Test
	public void 전체_멤버_조회용_서비스_메소드_테스트 () {
		
		//given
		
		//when
		List<MemberDTO> memberList = memberService.findAllMember();
		
		//then
		assertNotNull(memberList);
		System.out.println(memberList);
		
	}
	
//	@Test
//	
//	public void 전체_카테고리_조회용_서비스_메소드_테스트() {
//		
//		//given
//		
//		//when
//		List<CategoryDTO> categoryList = menuService.findAllCategory();
//		
//		//then
//		assertNotNull(categoryList);
//		System.out.println(categoryList);
//		
//	}
	
//	@Test
//	
//	public void 신규_메뉴_등록용_서비스_성공_테스트() throws Exception {
//		
//		//given
//		MenuDTO menu = new MenuDTO();
//		menu.setName("입력테스트메뉴2");
//		menu.setPrice(30000);
//		menu.setCategoryCode(4);
//		menu.setOrderableStatus("Y");
//		
//		//when
//		boolean result = menuService.registMenu(menu);
//		
//		//then
//		assertTrue(result);
//		
//	}
//	
//	@Test
//	
//	public void 신규_메뉴_등록용_서비스_실패_테스트() throws Exception {
//		
//		//given
//		MenuDTO menu = new MenuDTO();
//		menu.setName("입력테스트메뉴3");
//		menu.setPrice(30000);
//		menu.setCategoryCode(100);
//		menu.setOrderableStatus("Y");
//				
//		//when & then
//		assertThrows(Exception.class, () -> menuService.registMenu(menu));
//	}
	
	
}














