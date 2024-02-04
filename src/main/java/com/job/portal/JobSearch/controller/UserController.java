/*
package com.job.portal.JobSearch.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.job.portal.JobSearch.entity.Response;
import com.job.portal.JobSearch.entity.User;
import com.job.portal.JobSearch.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public Response registration(@RequestBody User user) throws JsonProcessingException {

        return userService.registration(user);
    }
}
*/
