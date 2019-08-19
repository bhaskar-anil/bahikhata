package in.taskoo.bahikhata.order.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import in.taskoo.bahikhata.order.constant.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "tasker_id")
    private Long taskerId;

    @Column(name = "address_id")
    private Long addressId;

    @OneToOne(mappedBy = "cart", cascade = CascadeType.ALL)
    private Long cartId;

    @Column(name = "status")
    @Builder.Default
    private final OrderStatus status = OrderStatus.CREATED;

    @Column(name = "order_at")
    private LocalDateTime oderAt;

    @Column(name = "order_at")
    private LocalDateTime dueAt;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "payable_amount")
    private Double payableAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
}