package com.ylqq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ylqq
 */
@SpringBootApplication
@PropertySource(value = {"application.properties"})
@MapperScan(basePackages = "mapper/")
public class QAsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(QAsystemApplication.class,args);
    }
}
