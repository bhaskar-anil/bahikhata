package in.taskoo.bahikhata.order.entity;

import java.time.LocalDateTime;

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
    private LocalDateTime oderAt;
    private LocalDateTime dueAt;
    private Double totalAmount;
    private Double payableAmount;
}