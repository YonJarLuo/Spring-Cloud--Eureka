package com.jiayuan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

/**
 * Created by LuoYJ on 2018/3/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class SecondServer {
    //Eureka服务器 设置端口8761/8762  从配置文件里看出，可以当做2个服务器使用
    public static void main(String[] args) {
        //从控制台输入，决定使用哪个profiles
        System.out.println("请输入使用的profiles: ");
        Scanner scan = new Scanner(System.in);
        String profiles = scan.nextLine();
        //使用.profiles()方法设置读取配置文件里的哪个profiles
        new SpringApplicationBuilder(FirstServer.class).profiles(profiles).run(args);
    }
}
