package com.jiekeliu.mapper;

import com.jiekeliu.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/17 0017 12:49
 * @Description:
 */
public interface BookMapper {
    // 添加一本书
    int addBook(Books book);
    // 删除一本书
    int delBookByid(@Param("bookID") int bookID);
    // 修改一本书
    int upBook(Books book);
    // 查询所有书
    List<Books> getBooks();

}
