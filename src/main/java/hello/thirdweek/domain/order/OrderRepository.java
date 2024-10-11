package hello.thirdweek.domain.order;


import hello.thirdweek.infra.order.entity.OrderInfoEntity;
import hello.thirdweek.interfaces.product.record.OrderRequest;

import java.util.List;

public interface OrderRepository {

    OrderInfoEntity order(OrderRequest orderRequest);
}
