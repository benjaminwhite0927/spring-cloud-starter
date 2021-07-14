package org.benjamin.product.api;

import org.benjamin.product.pojo.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("product")
public interface IProductService {

    @GetMapping("product")
    public Product getProductByName(String name);
}
