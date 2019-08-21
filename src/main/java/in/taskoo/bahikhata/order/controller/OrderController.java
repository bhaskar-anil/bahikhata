package in.taskoo.bahikhata.order.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import in.taskoo.bahikhata.order.dto.OrderDTO;
import in.taskoo.bahikhata.order.service.OrderService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public Long post(@RequestBody OrderDTO dto) {
        return service.save(dto);
    }
    
    @GetMapping(path = "/{orderId}", produces = APPLICATION_JSON_UTF8_VALUE)
    public OrderDTO get(@PathVariable Long orderId) {
        return service.findById(orderId);
    }
}