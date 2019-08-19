package in.taskoo.bahikhata.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.taskoo.bahikhata.order.dto.OrderDTO;
import in.taskoo.bahikhata.order.service.OrderService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private OrderService service;

    @PostMapping(value="path")
    public Long post(@RequestBody OrderDTO dto) {
        return service.save(dto);
    }
    
    
}