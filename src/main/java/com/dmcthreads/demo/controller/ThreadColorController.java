package com.dmcthreads.demo.controller;

import com.dmcthreads.demo.service.ThreadColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadColorController {

    @Autowired
    ThreadColorService service;

}
