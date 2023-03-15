package com.geektcp.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * site: https://github.com/geektcp
 * @author geektcp@163.com on 2023/3/14 15:44.
 */
@Slf4j
@EnableScheduling
@EnableAsync
@ComponentScan(lazyInit = true)
@SpringBootApplication
@ComponentScan({"com.*"})
public class ThyApp {
    public static void main(String[] args) {
        SpringApplication.run(ThyApp.class, args);
    }
}
