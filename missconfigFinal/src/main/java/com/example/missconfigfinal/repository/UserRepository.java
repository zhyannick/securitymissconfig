package com.example.missconfigfinal.repository;

import com.example.missconfigfinal.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}