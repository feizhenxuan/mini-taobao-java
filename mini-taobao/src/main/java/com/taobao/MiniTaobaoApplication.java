package com.taobao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class MiniTaobaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiniTaobaoApplication.class, args);
    }

    // 项目启动自动插入3个测试商品
    @Bean
    CommandLineRunner initData(ProductRepository productRepository){
        return args -> {
            Product p1 = new Product();
            p1.setName("小米手机");
            p1.setPrice(new BigDecimal("1999.00"));
            p1.setStock(100);

            Product p2 = new Product();
            p2.setName("华为平板");
            p2.setPrice(new BigDecimal("2999.00"));
            p2.setStock(50);

            Product p3 = new Product();
            p3.setName("苹果耳机");
            p3.setPrice(new BigDecimal("999.00"));
            p3.setStock(200);

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);
        };
    }
}