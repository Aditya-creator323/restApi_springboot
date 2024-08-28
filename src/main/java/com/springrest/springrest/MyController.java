package com.springrest.springrest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/home")
    public String home() {
        return "This is home";
    }

    // get the coureses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        
    }
}
