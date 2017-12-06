package com.dbs.bootcamp.audit;

import com.dbs.bootcamp.audit.domain.*;
import com.dbs.bootcamp.audit.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    LogService logService;

    @Autowired
    LogRepository temprepo;

    @Bean
    public CommandLineRunner demo(LogRepository repository) {
        return (args) -> {

            //logService.create(new Log("INFO","1679","Thread-10","main","Error error 1"));


            for (Log temp : temprepo.findAll()) {
                log.info(temp.toString());
            }

        };
    }
}