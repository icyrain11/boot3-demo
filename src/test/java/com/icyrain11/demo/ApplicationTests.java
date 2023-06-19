package com.icyrain11.demo;

import com.icyrain11.demo.data.entity.User;
import com.icyrain11.demo.data.repository.UserRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserRepository userRepository;


    @Test
    void contextLoads() {
        long userCount = userRepository.countByUserName("icyrain11");
        System.out.println("userCount = " + userCount);
    }

}
