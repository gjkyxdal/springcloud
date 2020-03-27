package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.BookClientFeign;
import cn.how2j.springcloud.client.ProductClientFeign;
import cn.how2j.springcloud.pojo.Book;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    @Autowired
    BookClientFeign bf;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
    }
    public List<Book> listBooks(){  return bf.listBooks();  }
}

