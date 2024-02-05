package com.blog.maccodes.service;

import com.blog.maccodes.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();

}
