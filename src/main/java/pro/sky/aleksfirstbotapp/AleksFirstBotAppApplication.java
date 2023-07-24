package pro.sky.aleksfirstbotapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AleksFirstBotAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AleksFirstBotAppApplication.class, args);
    }
}
