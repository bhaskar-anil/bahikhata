package in.taskoo.bahikhata.order.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.taskoo.bahikhata.order.dto.OrderDTO;
import in.taskoo.bahikhata.order.dto.OrderItemDTO;
import in.taskoo.bahikhata.order.entity.Order;
import in.taskoo.bahikhata.order.entity.OrderItem;

@Component
@PropertySource("classpath:uris/uris.properties")
public class OrderMapper {
    @Value("${backbone.item.search}")

    RestTemplate restTemplate = new RestTemplate();

    private transient Integer payableAmount = 0;
    private transient Integer totalAmount = 0;

    public Order mapToEntity(final OrderDTO dto){
        calculatePrices(dto.getItems());
        return Order.builder()
            .userId(dto.getUserId())
            .taskerId(dto.getTaskerId())
            .addressId(dto.getAddressId())
            .items(prepareItems(dto.getItems()))
            .orderAt(dto.getOrderAt())
            .dueAt(dto.getDueAt())
            .build();
    }

    private void calculatePrices(final List<OrderItemDTO> items) {
        
    }

    private List<OrderItem> prepareItems(final List<OrderItemDTO> itemDTOs) {
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

	public OrderDTO mapToDto(final Order order) {
		return null;
	}
    
}