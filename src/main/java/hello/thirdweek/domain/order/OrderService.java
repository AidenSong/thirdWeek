package hello.thirdweek.domain.order;


import hello.thirdweek.domain.member.MemberRepository;
import hello.thirdweek.domain.product.ProductRepository;
import hello.thirdweek.infra.order.entity.OrderInfoEntity;
import hello.thirdweek.interfaces.product.record.OrderRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {


    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final MemberRepository memberRepository;



    public boolean productList(OrderRequest orderRequest) {
        OrderInfoEntity order = orderRepository.order(orderRequest);

        order.getProductList().split(",");
        long memberId = order.getMemberId();
        long orderId = order.getOrderId();

        // 결제
        int amount = memberRepository.amount(memberId);
        int sum = 0;
        for () {
        }

    }
}
