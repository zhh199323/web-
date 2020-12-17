package com.wang.mapper;

import com.wang.domain.BookCategory;
import com.wang.domain.BookCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookCategoryMapper {
    long countByExample(BookCategoryExample example);

    int deleteByExample(BookCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(BookCategory record);

    int insertSelective(BookCategory record);

    List<BookCategory> selectByExample(BookCategoryExample example);

    BookCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByExample(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByPrimaryKeySelective(BookCategory record);

    int updateByPrimaryKey(BookCategory record);

    //分页查询
    List<BookCategory> selectByPageNum(@Param("currIndex") int currIndex, @Param("pageSize") int pageSize);

    int selectAllCount();
}