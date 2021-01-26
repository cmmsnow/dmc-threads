package com.dmcthreads.demo.service;

import com.dmcthreads.demo.model.ThreadColor;
import com.dmcthreads.demo.repository.ThreadColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadColorService {

    @Autowired
    ThreadColorRepository repository;

    public ThreadColor addThreadColor(ThreadColor threadColor){
        return repository.save(threadColor);
    }

    public void deleteThreadColor(Integer colorId){
        repository.delete(repository.findThreadColorByColorId(colorId));
    }

    public List<ThreadColor> getAllThreadColors(){
        return (List<ThreadColor>) repository.findAll();
    }

    public ThreadColor getThreadColorById(Integer colorId){
        return repository.findThreadColorByColorId(colorId);
    }

    public ThreadColor putEditThreadColor(Integer colorId, String colorName, String hexadecimal, String colorFamily){
        ThreadColor threadColor = repository.findThreadColorByColorId(colorId);
        threadColor.setColorName(colorName);
        threadColor.setHexadecimal(hexadecimal);
        threadColor.setColorFamily(colorFamily);
        return repository.save(threadColor);
    }
}
