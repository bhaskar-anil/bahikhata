package in.taskoo.bahikhata.order.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    @NotNull
    private Long priceId;

    @Positive
    @Builder.Default
    private final Integer quantity = 1;
    private Long discountId; 
}