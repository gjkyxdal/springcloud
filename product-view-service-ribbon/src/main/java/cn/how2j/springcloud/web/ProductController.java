package cn.how2j.springcloud.web;

import cn.how2j.springcloud.pojo.Book;
import cn.how2j.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object getP(Model m){
        List ls= productService.listProducts();
        m.addAttribute("ps",ls);
        return "product";
    }
    @RequestMapping("/books")
    public Object getB(Model m){
        List<Book> ls =productService.listBooks();
        m.addAttribute("ps",ls);
        return "book";
    }
}
