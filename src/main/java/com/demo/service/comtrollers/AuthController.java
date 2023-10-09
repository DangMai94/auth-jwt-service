package com.demo.service.comtrollers;

import com.demo.service.dto.LoginRequest;
import com.demo.service.dto.SignupRequest;
import com.demo.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	UserService userService;
	

	
	@PostMapping("/sign-in")
	public ResponseEntity<?> authenticateUser(@Validated @RequestBody LoginRequest loginRequest){
		return userService.authenticateUser(loginRequest);
	}
	
	@PostMapping("/sign-up")
	public ResponseEntity<?> registerUser(@Validated @RequestBody SignupRequest signUpRequest){
		return userService.registerUser(signUpRequest);
	}
	
	
	

}
