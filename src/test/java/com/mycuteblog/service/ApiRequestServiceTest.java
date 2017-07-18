/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycuteblog.service;

import com.mycuteblog.service.ApiRequestService;
import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.service.impl.ApiRequestServiceImpl;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author isaac
 */
public class ApiRequestServiceTest {
    
    private static ApiRequestService aps;
    ApiRequest apiRequest;
    
    @BeforeClass
    public static void Init(){
    aps = new ApiRequestServiceImpl();
    }
    
    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }
    
    @Test
    public void example(){
        aps.testExample();
    }
        
}
