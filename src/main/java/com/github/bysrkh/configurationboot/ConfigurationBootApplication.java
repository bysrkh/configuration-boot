/*
 * Configuration Boot's starter class
 *
 * MIT License
 * @author bysrkh
 * @since 2021-09-05
 */
package com.github.bysrkh.configurationboot;

import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationBootApplication.class, args);
    }

}