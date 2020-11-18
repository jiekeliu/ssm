package com.jiekeliu.controller;

import com.jiekeliu.pojo.Books;
import com.jiekeliu.pojo.User;
import com.jiekeliu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/17 0017 23:47
 * @Description:
 */
//
//@Controller
//@RequestMapping("/book")
@RestController
public class BookController {
//    @Autowired
//    @Qualifier("BookServiceImpl")
//    private BookService bookService;
//    @RequestMapping("/allBook")
//    public void allBook(HttpServletResponse httpServletResponse) throws IOException {
//        List<Books> list = bookService.getBooks();

//        httpServletResponse.getWriter().print("aaaa");
//    }
    @RequestMapping("/a1")
    public List<String> a1(){
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("aaaaaaa");
        aa.add("aaaaaaa");
        aa.add("aaaaaaa");
        return aa;
    }

}
