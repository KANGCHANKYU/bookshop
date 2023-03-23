package com.greedy.bookshop.admin.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greedy.bookshop.admin.member.model.dao.MemberMapper;
import com.greedy.bookshop.admin.member.model.dto.MemberDTO;


@Service("memberService") //빈 네임 등록
@Transactional
/* @Transactional 어노테이션이 붙은 클래스 내부의 메소드는 모두 transaction 관리가 된다.
 * @Transactional 어노테이션은 메소드 레벨로 분리해서 작성할 수도 있다.
 * 메소드 동작시 Exception이 발생하면 전체 트랜잭션을 rollback하고 정상 수행 시에는 commit하는 동작이 일어난다. */
public class MemberServiceImpl implements MemberService {
	
	private final MemberMapper memberMapper; //의존성 주입 코드
	
	@Autowired
	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	} //의존성 주입~~

	@Override
	public List<MemberDTO> findAllMember() {
		return memberMapper.findAllMember();
	}

//	@Override
//	public List<CategoryDTO> findAllCategory() {
//		return menuMapper.findAllCategory();
//	}
//
//	@Override
//	public boolean registMenu(MenuDTO menu) throws Exception {
//		
//		int result = menuMapper.registMenu(menu);
//		
//		if(result <= 0) {
//			throw new Exception("메뉴 등록에 실패하였습니다.");
//		}
//		
//		return result > 0 ? true : false;
	}


