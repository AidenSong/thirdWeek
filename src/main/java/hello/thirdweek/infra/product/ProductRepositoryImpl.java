package hello.thirdweek.infra.product;

import hello.thirdweek.domain.product.ProductRepository;
import hello.thirdweek.infra.product.entity.ProductInfoEntity;
import hello.thirdweek.infra.product.jparepository.ProductInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {


    private final ProductInfoJpaRepository productInfoJpaRepository;


    @Override
    public List<ProductInfoEntity> productList() {
        List<ProductInfoEntity> productList = productInfoJpaRepository.findAll();
        if (productList.isEmpty()) {
            return null;
        }
        return productList;
    }

    @Override
    public int price(long productId) {
        Optional<ProductInfoEntity> product = productInfoJpaRepository.findById(productId);
        if (product.isPresent()) {
            return product.get().getProductPrice();
        }
        return 0;
    }
}
