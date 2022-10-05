package com.example.ld.client;


import com.example.ld.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName userclient
 * @Description userservice是服务名称
 *
 * @Date 2022/10/5 20:54
 */

@FeignClient("userservice")
public interface userclient {
    /**
     * userservice+/user/id 就是访问网站了，直接远程调用，太优雅了
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    User findbyid(@PathVariable("id") Long id );
}
