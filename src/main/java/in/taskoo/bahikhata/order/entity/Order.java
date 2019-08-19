package in.taskoo.bahikhata.order.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

import in.taskoo.bahikhata.order.constant.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long taskerId;
    private Long addressId;
    private Long cartId;
    private OrderStatus status;
    private LocalDateTime oderAt;
    private LocalDateTime dueAt;
    private Double totalAmount;
    private Double payableAmount;
    private List<OrderItem> items;
}