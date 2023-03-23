package com.greedy.bookshop.admin.member.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.greedy.bookshop.admin.member.model.dto.BookDTO;

@Mapper
public interface AdminMapper {
	
	/* 상품 등록 */
	public void bookEnroll(BookDTO book);

}
