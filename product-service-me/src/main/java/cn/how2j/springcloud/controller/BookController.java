package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.Book;
import cn.how2j.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bs;

    @RequestMapping("/books")
    public Object getBooks(){
        List<Book> ls=bs.listBook();
        return ls;
    }
}
