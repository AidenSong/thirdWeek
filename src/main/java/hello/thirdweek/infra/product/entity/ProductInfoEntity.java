package hello.thirdweek.infra.product.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT")
public class ProductInfoEntity {

    @Id
    private long productId;
    private String productName;
    private int productQuantity;
    private int productPrice;
}
