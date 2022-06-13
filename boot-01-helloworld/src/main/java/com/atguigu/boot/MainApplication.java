package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
    @author : 鹏博
    @date : 2022/6/1220:18
    @description : some description
*/

/**
 * 主程序类
 * SpringBootApplicationL这是一个SpringBoot应用
 */
@SpringBootApplication(scanBasePackages = "com.atguigu")
public class MainApplication {
    public static void main(String[] args) {
        //1、返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2、查看容器里面的组件
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
