package com.tbthecoder.herokudiary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Welcome {
    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
