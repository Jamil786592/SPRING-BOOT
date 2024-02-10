package com.job.portal.JobSearch;

import com.job.portal.JobSearch.entity.Emplye;
import com.job.portal.JobSearch.repository.EmployeeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class JobSearchApplication {
    @Autowired
    private EmployeeResp employeeResp;

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
    @GetMapping("/employee")
    public List<Emplye> getALlValue(){
        return employeeResp.findAll();
    }
}
