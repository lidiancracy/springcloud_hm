package com.example.order.service;



import com.example.ld.client.userclient;
import com.example.ld.pojo.User;
import com.example.order.mapper.OrderMapper;
import com.example.order.pojo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
//    @Autowired
//    RestTemplate restTemplate;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    userclient userclient;
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        if (order != null) {
            Long userId = order.getUserId();
            User findbyid = userclient.findbyid(userId);
            order.setUser(findbyid);
        }
        // 4.返回
        return order;
    }
//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//        if(order!=null){
//            Long userId = order.getUserId();
//            String url="http://userservice/user/"+userId;
//            User forObject = restTemplate.getForObject(url, User.class);
//            order.setUser(forObject);
//        }
//        // 4.返回
//        return order;
//    }
}
