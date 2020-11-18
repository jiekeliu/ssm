package com.jiekeliu.service;

import com.jiekeliu.pojo.Books;

import java.util.List;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/17 0017 14:03
 * @Description:
 */
public interface BookService {
    // 添加一本书
    int addBook(Books book);
    // 删除一本书
    int delBookByid(int bookID);
    // 修改一本书
    int upBook(Books book);
    // 查询所有书
    List<Books> getBooks();
}
