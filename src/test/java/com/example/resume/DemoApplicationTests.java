package com.example.resume;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
@MapperScan(basePackages = "com.")
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
