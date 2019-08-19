package in.taskoo.bahikhata.order.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderDTO {
    private Long id;
    private Long userId;
    private Long taskerId;
    private String addressId;
    private Long cartId;
    private String oderAt;
    private String dueAt;
    private List<OrderItemDTO> items;
}