package com.icyrain11.demo.data.repository;

import com.icyrain11.demo.data.entity.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * @author icyrain11
 * @version 1.8
 */
public interface UserRepository extends CrudRepository<User, Long> {

    long countByName(String userName);

}
