package in.taskoo.bahikhata.order.service;

import org.springframework.stereotype.Service;

import in.taskoo.bahikhata.order.dto.OrderDTO;
import in.taskoo.bahikhata.order.mapper.OrderMapper;
import in.taskoo.bahikhata.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    private final OrderMapper mapper;

	public Long save(OrderDTO dto) {
		return repository.save(mapper.mapToEntity(dto)).getId();
	}

    
}