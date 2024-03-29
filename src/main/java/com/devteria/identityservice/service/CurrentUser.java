package com.devteria.identityservice.service;
import com.devteria.identityservice.entity.User;
import com.devteria.identityservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class CurrentUser {

    @Autowired
    UserRepository userRepository;
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentName = authentication.getName();
        Optional<User> user = userRepository.findByUsername(currentName);
        return user.orElse(null);
    }

}
