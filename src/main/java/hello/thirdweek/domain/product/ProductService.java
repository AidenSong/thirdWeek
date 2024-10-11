package hello.thirdweek.domain.product;


import hello.thirdweek.infra.product.entity.ProductInfoEntity;
import hello.thirdweek.infra.product.jparepository.ProductInfoJpaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;




    public List<ProductInfoEntity> productList() {
        return productRepository.productList();
    }




}
