package com.greedy.bookshop.admin.member.model.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.greedy.bookshop.admin.member.model.dto.MemberDTO;
import com.greedy.bookshop.config.BookshopApplication;

@SpringBootTest
/* 어플리케이션 설정을 해당 설정 파일에서 가져오겠다는 의미 */
@ContextConfiguration(classes = {BookshopApplication.class})
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;

	@Test
	public void 매퍼_인터페이스_의존성_주입_테스트() {
		
		assertNotNull(memberMapper); //import 주입 잘 되었는지 여기서 실행.
	}
	
	@Test
	public void 전체_회원_조회용_매퍼_테스트() {
		
		//given
		
		//when
		List<MemberDTO> memberList = memberMapper.findAllMember();
		
		//then
		assertNotNull(memberList);
		System.out.println(memberList);
	}
	
//	@Test
//	public void 전체_카테고리_조회용_매퍼_테스트() {
//		
//		//given
//		
//		//when
//		List<CategoryDTO> categoryList = menuMapper.findAllCategory();
//		
//		//then
//		assertNotNull(categoryList);
//		System.out.println(categoryList);
//		
//	}
//	
//	@Test
//	@DisplayName("신규 메뉴가 잘 추가 되는지 매퍼 인터페이스의 메소드 확인")
//	public void testRegistMenu() {
//		
//		//given
//		MenuDTO menu = new MenuDTO();
//		menu.setName("입력 테스트 메뉴");
//		menu.setPrice(30000);
//		menu.setCategoryCode(4);
//		menu.setOrderableStatus("Y");
//		
//		//when
//		int result = menuMapper.registMenu(menu);
//		
//		//then
//		assertEquals(1, result);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
