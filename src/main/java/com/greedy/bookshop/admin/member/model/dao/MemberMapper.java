package com.greedy.bookshop.admin.member.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.greedy.bookshop.admin.member.model.dto.MemberDTO;



@Mapper
public interface MemberMapper {

	List<MemberDTO> findAllMember();

}
