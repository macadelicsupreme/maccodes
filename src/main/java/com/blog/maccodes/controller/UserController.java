package com.blog.maccodes.controller;

import com.blog.maccodes.model.User;
import com.blog.maccodes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("get-users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
