package cn.how2j.springcloud.service;

import cn.how2j.springcloud.pojo.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Value("${server.port}")
    String port;

    public List<Book> listBook(){
        List<Book> ls=new ArrayList();
        ls.add(new Book("鲁宾逊漂流记",50,"丹尼尔·笛福  "+port));
        ls.add(new Book("围城",150,"钱钟书  "+port));
        ls.add(new Book("骆驼祥子",200,"老舍  "+port));
        return  ls;
    }
}
