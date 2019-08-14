package in.taskoo.bahikhata.order.entity;

import javax.persistence.Entity;

import in.taskoo.bahikhata.order.constant.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Order {
    private Long id;
    
    private Long userId;

    private Long addressId;

    private OrderStatus status;
}