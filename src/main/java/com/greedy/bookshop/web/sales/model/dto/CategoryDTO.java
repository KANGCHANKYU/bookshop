package com.greedy.bookshop.web.sales.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryDTO
{
    private long subCategoryCode;
    private String categoryName;
    private long topCategoryCode;
}
