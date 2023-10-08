package com.fdemo.fdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //对servlet组件的支持
@SpringBootApplication
public class FdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdemoApplication.class, args);
    }

}
