package com.example.order.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName resttemplate
 * @Description TODO
 * @Date 2022/10/4 15:41
 */
@Configuration
public class resttemplateconfig {
    /**
     * resttemplate注入容器
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate resttemplate(){
        return new RestTemplate();
    }


}
