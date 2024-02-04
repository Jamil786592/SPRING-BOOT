/*
package com.job.portal.JobSearch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.job.portal.JobSearch.entity.Response;
import com.job.portal.JobSearch.entity.User;
import com.job.portal.JobSearch.repository.UserRepository;
import com.job.portal.JobSearch.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Response registration(User user) throws JsonProcessingException {
        Response payload = null;
        User response = userRepository.saveAndFlush(user);
        if (response != null) {
            payload = ResponseUtil.response(HttpStatus.OK, HttpStatusCode.valueOf(200), "success", response);
        } else {
            payload = ResponseUtil.response(HttpStatus.EXPECTATION_FAILED, HttpStatusCode.valueOf(500), "failed", response);
        }
        return payload;
    }


}
*/
