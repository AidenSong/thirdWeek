package hello.thirdweek.interfaces.product.controller;


import hello.thirdweek.domain.product.ProductService;
import hello.thirdweek.infra.product.entity.ProductInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;



    @GetMapping("/list")
    public List<ProductInfoEntity> productList() {
        return productService.productList();
    }
}
