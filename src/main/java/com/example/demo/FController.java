/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author
 */
@RestController
public class FController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/")
    public String home(){
        String date = jdbcTemplate.queryForObject("select DB_NAME()", String.class);
        return "SpringBoot DEMO connected to "+date;
    }
    
}
