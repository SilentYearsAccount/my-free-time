package top.silentyears.freetime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "top.silentyears.freetime.mapper")
@SpringBootApplication
public class FreeTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeTimeApplication.class, args);
    }

}
