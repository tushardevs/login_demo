package com.spring.springbootmodule.service;

import com.spring.springbootmodule.model.Admin;
import com.spring.springbootmodule.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Admin findByEmail(String email);

    Admin save(UserRegistrationDto registration);
}
