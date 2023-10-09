package com.demo.service.services;

import com.demo.service.dto.LoginRequest;
import com.demo.service.dto.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);
    ResponseEntity<?> registerUser( SignupRequest signUpRequest);
}
