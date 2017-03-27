package com.oliverosjose.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by capitanjovi on 26/3/17.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
