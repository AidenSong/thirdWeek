package hello.thirdweek.infra.order;


import hello.thirdweek.domain.order.OrderRepository;
import hello.thirdweek.infra.member.jparepository.MemberInfoJpaRepository;
import hello.thirdweek.infra.order.entity.OrderInfoEntity;
import hello.thirdweek.infra.order.jparepository.OrderInfoJpaRepository;
import hello.thirdweek.infra.product.jparepository.ProductInfoJpaRepository;
import hello.thirdweek.interfaces.product.record.OrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderInfoJpaRepository orderInfoJpaRepository;


    @Override
    public OrderInfoEntity order(OrderRequest orderRequest) {
        Optional<OrderInfoEntity> orderResponse = orderInfoJpaRepository.findById(orderRequest.orderId());
        if (orderResponse.isPresent()) {
            return orderResponse.get();
        }
        return null;
    }


}
