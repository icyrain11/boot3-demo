package com.icyrain11.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icyrain11
 * @version 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String userName() {
        return "hello SpringBoot3 + jpa";
    }
}
