package com.wang.service;

import com.wang.domain.BookCategory;
import com.wang.utils.page.Page;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);
}
