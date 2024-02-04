/*
package com.job.portal.JobSearch.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.job.portal.JobSearch.entity.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class ResponseUtil {
    public static Response response(HttpStatus httpStatus, HttpStatusCode httpCode, String message, Object payload) {
        Response response = new Response();
        response.setHttpStatus(httpStatus);
        response.setStatusCode(httpCode);
        response.setMessage(message);
        response.setPayload(payload);
        return response;
    }

    public static String getAsJson(Object registration) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        if (registration != null) {
            json = objectMapper.writeValueAsString(registration);
        }
        return json;
    }
}
*/
