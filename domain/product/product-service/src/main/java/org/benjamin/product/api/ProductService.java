package org.benjamin.product.api;

import lombok.extern.slf4j.Slf4j;
import org.benjamin.product.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductService implements IProductService{

    /**
     * 配置中心读取数据
     */
    @Value("${item_url}")
    private String url;

    @Override
    public Product getProductByName(String name) {
        log.info("The data get from data - {}", url);
        return null;
    }
}
