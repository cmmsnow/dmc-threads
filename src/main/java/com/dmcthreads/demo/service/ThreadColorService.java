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

    public void deleteThreadColor(Integer ColorID){
        repository.delete(repository.findThreadColorByColorID(ColorID));
    }

    public List<ThreadColor> getAllThreadColors(){
        return (List<ThreadColor>) repository.findAll();
    }

    public ThreadColor getThreadColorByID(Integer ColorID){
        return repository.findThreadColorByColorID(ColorID);
    }

    public ThreadColor putEditThreadColor(Integer ColorID, String ColorName, String Hexadecimal, String ColorFamily){
        ThreadColor threadColor = repository.findThreadColorByColorID(ColorID);
        threadColor.setColorName(ColorName);
        threadColor.setHexadecimal(Hexadecimal);
        threadColor.setColorFamily(ColorFamily);
        return repository.save(threadColor);
    }
}
