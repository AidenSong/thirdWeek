package hello.thirdweek.domain.product;


import hello.thirdweek.infra.product.entity.ProductInfoEntity;
import hello.thirdweek.infra.product.jparepository.ProductInfoJpaRepository;

import java.util.List;

public interface ProductRepository {


    List<ProductInfoEntity> productList();

    int price(long productId);
}
