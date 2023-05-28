package com.example.demo.Domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
public class Home {

    @CrossOrigin
    @GetMapping("")
    public ResponseEntity getEventById() {
        return new ResponseEntity("Hello World!", HttpStatus.OK);
    }
}
