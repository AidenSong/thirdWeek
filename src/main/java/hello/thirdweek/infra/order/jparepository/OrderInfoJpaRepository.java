package hello.thirdweek.infra.order.jparepository;

import hello.thirdweek.infra.order.entity.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoJpaRepository extends JpaRepository<OrderInfoEntity, Long> {
}
