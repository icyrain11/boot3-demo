package com.icyrain11.demo.controller;

import com.icyrain11.demo.common.Result;
import com.icyrain11.demo.service.UserService;
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

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public Result<String> userName() {
        return Result.success("springboot3 + jpa");
    }
}
