package com.icyrain11.demo.service;

import com.icyrain11.demo.data.entity.User;
import com.icyrain11.demo.data.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author icyrain11
 * @version 1.8
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByName(String userName) {
        return null;
    }
}
