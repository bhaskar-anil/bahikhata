package in.taskoo.bahikhata.order.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import in.taskoo.bahikhata.order.dto.OrderDTO;
import in.taskoo.bahikhata.order.dto.OrderItemDTO;
import in.taskoo.bahikhata.order.entity.Order;
import in.taskoo.bahikhata.order.entity.OrderItem;

@Component
public class OrderMapper {
    public Order mapToEntity(OrderDTO dto){
        return Order.builder()
            .userId(dto.getUserId())
            .taskerId(dto.getTaskerId())
            .items(prepareItems(dto.getItems()))
            .build();
    }

    private List<OrderItem> prepareItems(List<OrderItemDTO> itemDTOs) {
        List<OrderItem> items = new ArrayList<>();
        for(OrderItemDTO dto : itemDTOs) {
            items.add(OrderItem.builder()
            .priceId(dto.getPriceId())
            .quantity(dto.getQuantity())
            .discountId(dto.getDiscountId())
            .build());
        }
        return items;
    }
    
}