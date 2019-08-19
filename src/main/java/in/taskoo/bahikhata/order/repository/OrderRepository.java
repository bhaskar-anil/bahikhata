package in.taskoo.bahikhata.order.repository;

import org.springframework.stereotype.Repository;

import in.taskoo.bahikhata.order.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}