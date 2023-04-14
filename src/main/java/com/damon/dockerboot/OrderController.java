package com.damon.dockerboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/order/index")
    public String helloDocker() {
        return "hello,docker,port:" + port + ",uuid:" + UUID.randomUUID();
    }
}
