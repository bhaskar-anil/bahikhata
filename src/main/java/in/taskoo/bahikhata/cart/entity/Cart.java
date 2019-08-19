package in.taskoo.bahikhata.cart.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Cart {
    private Long id;
    private Long userId;
    private Long taskerId;
    private Long addressId;
    private Long cartId;
    private Double totalAmount;
    private Double payableAmount;
    private String sessionId;
}