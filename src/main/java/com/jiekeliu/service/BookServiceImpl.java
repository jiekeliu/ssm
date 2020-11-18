package com.jiekeliu.service;

import com.jiekeliu.mapper.BookMapper;
import com.jiekeliu.pojo.Books;

import java.util.List;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/17 0017 14:05
 * @Description:
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {

        return bookMapper.addBook(book);
    }

    public int delBookByid(int bookID) {

        return bookMapper.delBookByid(bookID);
    }

    public int upBook(Books book) {

        return bookMapper.upBook(book);
    }

    public List<Books> getBooks() {

        return bookMapper.getBooks();
    }
}
