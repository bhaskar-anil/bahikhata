package in.taskoo.bahikhata.cart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import in.taskoo.bahikhata.order.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long taskerId;
    
    @OneToOne(mappedBy = "cart", cascade = CascadeType.ALL)
    private Order order;
    private Long addressId;
    private Long cartId;
    private Double totalAmount;
    private Double payableAmount;
    private String sessionId;
}