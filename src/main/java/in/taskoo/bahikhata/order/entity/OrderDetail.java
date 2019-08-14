package in.taskoo.bahikhata.order.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class OrderDetail {
    private Long orderId;
    private String orderDevice;
}