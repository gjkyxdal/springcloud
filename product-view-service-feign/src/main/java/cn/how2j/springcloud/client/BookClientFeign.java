package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Book;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-ME")
public interface BookClientFeign {

    @GetMapping("/books")
    public List<Book> listBooks();
}
