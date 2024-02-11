package com.job.portal.JobSearch;

import com.job.portal.JobSearch.entity.Emplye;
import com.job.portal.JobSearch.repository.EmployeeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication

public class JobSearchApplication {
    @Autowired
    private EmployeeResp employeeResp;

    public static void main(String[] args) {
        SpringApplication.run(JobSearchApplication.class, args);
    }



}
