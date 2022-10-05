package com.example.order.service;


import com.example.order.mapper.OrderMapper;
import com.example.order.pojo.Order;
import com.example.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        if(order!=null){
            Long userId = order.getUserId();
            String url="http://userservice/user/"+userId;
            User forObject = restTemplate.getForObject(url, User.class);
            order.setUser(forObject);
        }
        // 4.返回
        return order;
    }
}
