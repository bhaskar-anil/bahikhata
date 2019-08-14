package in.taskoo.bahikhata.invoice.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Invoice {
    private Long id;
    private Long orderId;
}