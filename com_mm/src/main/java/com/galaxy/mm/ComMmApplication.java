package com.galaxy.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.galaxy.mm.mapper")
@EnableTransactionManagement
public class ComMmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComMmApplication.class, args);
    }

}
