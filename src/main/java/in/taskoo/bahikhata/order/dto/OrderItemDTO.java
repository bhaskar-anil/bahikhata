package in.taskoo.bahikhata.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderItemDTO {
    private Long orderId;
    private Long priceId;
    private Integer quantity;
    private Long discountId; 
}