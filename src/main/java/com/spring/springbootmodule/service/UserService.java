package com.spring.springbootmodule.service;

import com.spring.springbootmodule.model.User;
import com.spring.springbootmodule.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
