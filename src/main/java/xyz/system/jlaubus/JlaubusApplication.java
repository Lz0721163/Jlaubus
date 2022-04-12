package xyz.system.jlaubus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xyz.system.jlaubus.mapper")
@SpringBootApplication
public class JlaubusApplication {

    public static void main(String[] args) {

        SpringApplication.run(JlaubusApplication.class, args);
    }

}
