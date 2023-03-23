package com.greedy.bookshop.web.sales.model.dao;


import com.greedy.bookshop.web.sales.model.dto.BookDTO;
import com.greedy.bookshop.web.sales.model.dto.FileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BookMapper
{
    int insertBook(BookDTO b);

    int insertFile(FileDTO f);

    List<BookDTO> selcetAllBook();

    List<FileDTO> selcetAllFile();

    List<BookDTO> selectBookCategory(long c);

    List<FileDTO> selectFileCategory(long b);

}
