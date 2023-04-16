package com.fusheng.daqijiance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DaqijianceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaqijianceApplication.class, args);
    }

}
