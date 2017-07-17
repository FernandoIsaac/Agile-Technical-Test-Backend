/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.todolist;

import com.mycompany.todolist.ApiRequest;
import com.mycompany.todolist.ApiRequestService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import static org.hibernate.criterion.Restrictions.gt;
import static org.hibernate.criterion.Restrictions.lt;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author isaac
 */
@RestController
@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getHome() {
        logger.info("Api request received");

        Map<String, String> response = new HashMap<String, String>();
        try {
            ApiRequest apiRequest = new ApiRequest(new Date());
            apiRequestService.create(apiRequest);
            response.put("status", "success");
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }
}
