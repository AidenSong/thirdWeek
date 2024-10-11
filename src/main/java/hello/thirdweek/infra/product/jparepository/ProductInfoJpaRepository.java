package hello.thirdweek.infra.product.jparepository;


import hello.thirdweek.infra.product.entity.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoJpaRepository extends JpaRepository<ProductInfoEntity, Long> {
}
