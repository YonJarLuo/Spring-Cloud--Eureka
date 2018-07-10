package com.jiayuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by LuoYJ on 2018/3/27.
 * 书上说的注解 @EnableDiscoveryClient 可能已过时，反正@EnableEurekaClient包括它在内，直接使用它即可
 */
@SpringBootApplication
@EnableEurekaClient
public class FirstInvoker {
    //Eureka 服务调用者
    public static void main(String[] args) {
        SpringApplication.run(FirstInvoker.class,args);
    }
}
