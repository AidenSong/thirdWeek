package hello.thirdweek.interfaces.order.controller;


import hello.thirdweek.domain.order.OrderService;
import hello.thirdweek.interfaces.order.record.ProductOrderRequest;
import hello.thirdweek.interfaces.product.record.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @GetMapping("/order")
    public String order(@RequestBody OrderRequest orderRequest) {
        orderService.
        return "";
    }

}
