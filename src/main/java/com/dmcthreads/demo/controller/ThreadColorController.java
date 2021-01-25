package com.dmcthreads.demo.controller;

import com.dmcthreads.demo.model.ThreadColor;
import com.dmcthreads.demo.service.ThreadColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080", "http://localhost"})
public class ThreadColorController {

    @Autowired
    ThreadColorService service;

    @PostMapping("threads/addthread")
    public ResponseEntity<ThreadColor> addComment(@RequestBody ThreadColor threadColor){
        return new ResponseEntity<>(service.addThreadColor(threadColor), HttpStatus.CREATED);}

    @DeleteMapping("deletethread/{ColorID}")
    public void deleteThreadColorById(@PathVariable Integer ColorID){ service.deleteThreadColor(ColorID);}

    @GetMapping("threads/allthreads")
    public ResponseEntity<List<ThreadColor>> getAllThreadColors(){
        return new ResponseEntity<>(service.getAllThreadColors(), HttpStatus.OK);
    }

    @GetMapping("threadsbyid/{ColorID}")
    public ResponseEntity<ThreadColor> getThreadColorByID(@PathVariable Integer ColorID){return new ResponseEntity<>(service.getThreadColorByID(ColorID), HttpStatus.OK);}

    @PutMapping("threads/{ColorID}")
    public ResponseEntity<ThreadColor> updateComment(@RequestBody ThreadColor threadColor, @PathVariable Integer ColorID) {
        return new ResponseEntity<>(service.putEditThreadColor(ColorID, threadColor.getColorName(), threadColor.getHexadecimal(), threadColor.getColorFamily()), HttpStatus.OK);
    }

}
