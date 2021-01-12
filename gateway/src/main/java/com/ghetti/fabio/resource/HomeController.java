package com.ghetti.fabio.resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String hello() {
        return "Hello buddy!";
    }
}
