package com.jiayun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

/**
 * Created by LuoYJ on 2018/3/27.
 * @EnableEurekaClient说明是Eureka的客户端
 */
@SpringBootApplication
@EnableEurekaClient
public class FirstServiceProvider {
    //Eureka 服务提供者（客户端）
    public static void main(String[] args) {
        System.out.println("请输入端口：");
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        //使用.properties()来设置端口
        new SpringApplicationBuilder(FirstServiceProvider.class).properties("server.port="+port).run(args);
    }
}
