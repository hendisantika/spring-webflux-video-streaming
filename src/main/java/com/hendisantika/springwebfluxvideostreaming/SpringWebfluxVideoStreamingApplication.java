package com.hendisantika.springwebfluxvideostreaming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringWebfluxVideoStreamingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebfluxVideoStreamingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DefaultDataBufferFactory sharedInstance = DefaultDataBufferFactory.sharedInstance;
    }

}
