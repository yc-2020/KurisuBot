package xyz.yuchao.kurisubot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.yuchao.kurisubot.mapper.*")
public class KurisuBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(KurisuBotApplication.class, args);
    }

}
