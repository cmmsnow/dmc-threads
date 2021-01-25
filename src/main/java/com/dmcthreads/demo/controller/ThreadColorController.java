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
    ThreadColorService threadColorService;

    @PostMapping("threads/addthread")
    public ResponseEntity<ThreadColor> addComment(@RequestBody ThreadColor threadColor){
        return new ResponseEntity<>(threadColorService.addThreadColor(threadColor), HttpStatus.CREATED);}

    @DeleteMapping("deletethread/{colorID}")
    public void deleteThreadColorById(@PathVariable Integer colorID){ threadColorService.deleteThreadColor(colorID);}

    @GetMapping("threads/allthreads")
    public ResponseEntity<List<ThreadColor>> getAllThreadColors(){
        return new ResponseEntity<>(threadColorService.getAllThreadColors(), HttpStatus.OK);
    }

    @GetMapping("threadsbyid/{colorID}")
    public ResponseEntity<ThreadColor> getThreadColorByID(@PathVariable Integer colorID){return new ResponseEntity<>(threadColorService.getThreadColorByID(colorID), HttpStatus.OK);}

    @PutMapping("threads/{colorID}")
    public ResponseEntity<ThreadColor> updateComment(@RequestBody ThreadColor threadColor, @PathVariable Integer colorID) {
        return new ResponseEntity<>(threadColorService.putEditThreadColor(colorID, threadColor.getColorName(), threadColor.getHexadecimal(), threadColor.getColorFamily()), HttpStatus.OK);
    }

}
