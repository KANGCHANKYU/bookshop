package com.greedy.bookshop.admin.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greedy.bookshop.admin.member.model.dao.AdminMapper;
import com.greedy.bookshop.admin.member.model.dto.BookDTO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adminMapper;	
	
	/* 상품 등록 */
	@Override
	public void bookEnroll(BookDTO book) {
		
		log.info("(service)bookEnroll........");
		
		adminMapper.bookEnroll(book);
		
	}

}
