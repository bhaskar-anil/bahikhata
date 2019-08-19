package in.taskoo.bahikhata.order.entity;

import javax.persistence.Entity;
import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Valid
@Data
@Builder
@AllArgsConstructor
@Entity
public class OrderItem {
    private Long orderId;
    private Long priceId;
    private Integer quantity;
    private Long discountId;    
}