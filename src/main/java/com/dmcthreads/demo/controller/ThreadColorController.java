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

    @DeleteMapping("deletethread/{colorId}")
    public void deleteThreadColorById(@PathVariable Integer colorId){ threadColorService.deleteThreadColor(colorId);}

    @GetMapping("threads/allthreads")
    public ResponseEntity<List<ThreadColor>> getAllThreadColors(){
        return new ResponseEntity<>(threadColorService.getAllThreadColors(), HttpStatus.OK);
    }

    @GetMapping("threadsbyid/{colorId}")
    public ResponseEntity<ThreadColor> getThreadColorById(@PathVariable Integer colorId){return new ResponseEntity<>(threadColorService.getThreadColorById(colorId), HttpStatus.OK);}

    @PutMapping("threads/{colorId}")
    public ResponseEntity<ThreadColor> updateComment(@RequestBody ThreadColor threadColor, @PathVariable Integer colorId) {
        return new ResponseEntity<>(threadColorService.putEditThreadColor(colorId, threadColor.getColorName(), threadColor.getHexadecimal(), threadColor.getColorFamily()), HttpStatus.OK);
    }

}
