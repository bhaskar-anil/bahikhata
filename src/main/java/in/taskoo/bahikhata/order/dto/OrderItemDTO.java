package in.taskoo.bahikhata.order.dto;

import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderItemDTO {
    private Long priceId;
    @Positive
    private Integer quantity;
    private Long discountId; 
}