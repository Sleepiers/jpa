package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @ImportResource(locations = {"classpath:beans.xml"})
 * 加载xml加载配置文件
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
