package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello</h1>";
    }
    String aa;
}
