package com.github.bysrkh.configurationboot;

import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * provides bootable class for Spring Boot application
 * <p>
 * @since 2021-10-23
 * <br>
 * @version 0.0.1-SNAPSHOT
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigurationBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationBootApplication.class, args);
    }

}