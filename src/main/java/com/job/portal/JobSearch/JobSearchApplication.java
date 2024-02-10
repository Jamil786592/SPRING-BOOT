package com.job.portal.JobSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JobSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobSearchApplication.class, args);
    }


    @GetMapping("/hello")
    public String getValue() {
        return "hello Portal FEB 11";
    }

    @GetMapping("/hi")
    public String getValues() {
        return "Hi Jenkin  World";
    }
}
