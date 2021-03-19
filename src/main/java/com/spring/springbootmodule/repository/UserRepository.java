package com.spring.springbootmodule.repository;

import com.spring.springbootmodule.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Admin,Long> {
    Admin findByEmail(String email);
}
