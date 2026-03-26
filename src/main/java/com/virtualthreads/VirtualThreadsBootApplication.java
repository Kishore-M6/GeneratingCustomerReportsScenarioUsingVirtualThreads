package com.virtualthreads;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class VirtualThreadsBootApplication {
    static Logger logger= LoggerFactory.getLogger(VirtualThreadsBootApplication.class);
    public static void main(String[] args) {
        logger.info("Starting VirtualThreadsBootApplication with Thread Name: {} and Thread id: {}",
                Thread.currentThread().getName(),Thread.currentThread().getId());
        SpringApplication.run(VirtualThreadsBootApplication.class, args);

    }
}