package in.taskoo.bahikhata.order.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    @NotNull
    private Long userId;
    private Long taskerId;
    private Long addressId;
    private Long cartId;
    private LocalDateTime orderAt;
    @Future
    private LocalDateTime dueAt;
    private List<OrderItemDTO> items;
}