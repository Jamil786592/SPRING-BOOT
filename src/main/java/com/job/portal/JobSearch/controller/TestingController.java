package com.job.portal.JobSearch.controller;

import com.job.portal.JobSearch.entity.Emplye;
import com.job.portal.JobSearch.repository.EmployeeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@CrossOrigin(origins = "http://localhost:4300")
public class TestingController {
    @Autowired
    private EmployeeResp employeeResp;
    @GetMapping("/hello")
    public String getValue() {
        return "hello Portal FEB 12";
    }

    @GetMapping("/hi")
    public String getValues() {
        return "Hi Jenkin  World";
    }
    @GetMapping("/employee")
    public List<Emplye> getALlValue(){
        List<Emplye> emplyes= employeeResp.findAll();
        System.out.println(emplyes);
        return  emplyes;
    }
    @GetMapping("/name")
    public List<String> getNames(){
        List<Emplye> emplyes= employeeResp.findAll();
        List<String> names=emplyes.stream().map(x->x.getName()).collect(Collectors.toList());
        return  names;
    }
}
