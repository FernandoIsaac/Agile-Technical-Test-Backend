/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.todolist;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author isaac
 */
@Transactional
public class ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;

    public void create(ApiRequest apiRequest) {
        apiRequestDao.create(apiRequest);
    }
}
