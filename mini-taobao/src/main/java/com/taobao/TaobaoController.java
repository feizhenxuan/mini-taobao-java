package com.taobao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaobaoController {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private OrderRepository orderRepo;

    // 1. 商品列表
    @GetMapping("/product/list")
    public List<Product> list() {
        return productRepo.findAll();
    }

    // 2. 商品详情
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productRepo.findById(id).orElse(null);
    }

    // 3. 创建订单
    @PostMapping("/order/create")
    public Order createOrder(@RequestBody Order order) {
        order.setStatus(0);
        return orderRepo.save(order);
    }

    // 4. 查询我的订单
    @GetMapping("/order/user/{userId}")
    public List<Order> getOrders(@PathVariable Long userId) {
        return orderRepo.findByUserId(userId);
    }
}