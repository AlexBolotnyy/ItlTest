package com.itl.consulting.test_task.service.auth;

import com.itl.consulting.test_task.entity.user.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface CustomUserDetailsService extends UserDetailsService {

    AppUser getCurrentUser();
}
