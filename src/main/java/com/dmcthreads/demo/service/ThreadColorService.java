package com.dmcthreads.demo.service;

import com.dmcthreads.demo.repository.ThreadColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadColorService {

    @Autowired
    ThreadColorRepository repository;

}
