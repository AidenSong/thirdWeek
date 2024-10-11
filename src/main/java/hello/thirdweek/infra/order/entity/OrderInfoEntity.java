package hello.thirdweek.infra.order.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ORDER")
public class OrderInfoEntity {

    @Id
    private long orderId;
    private long memberId;
    private String productList;
}
