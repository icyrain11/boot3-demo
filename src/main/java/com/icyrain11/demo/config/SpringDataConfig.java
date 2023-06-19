package com.icyrain11.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author icyrain11
 * @version 1.8
 */
@Configuration
@EnableJpaRepositories("com.icyrain11.demo.data.repository")
public class SpringDataConfig {
}
