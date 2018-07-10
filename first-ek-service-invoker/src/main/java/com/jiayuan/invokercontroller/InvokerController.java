package com.jiayuan.invokercontroller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;

/**
 * Created by LuoYJ on 2018/3/27.
 */
@RestController
@Configuration
public class InvokerController {
    /**
     * RestTemplate本来是spring-web模板下的类，主要用来调用REST服务，本身不具备调用分布式服务的能力
     * 但是RestTemplate的Bean被@LoadBalanced注解修饰后
     * 这个RestTemplate实例就具有访问分布式服务的能力
     * */

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/router",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String router(){
        RestTemplate restTemplate = getRestTemplate();
        //根据应用名称调用服务
        String json = restTemplate.getForObject("http://first-cloud-provider/person/1", String.class);

        return json;
    }
}
