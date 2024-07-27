package com.saket.projecct.uber.uberApp.services.impl;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.SignupDto;
import com.saket.projecct.uber.uberApp.dto.UserDto;
import com.saket.projecct.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public Driverdto onboardNewDriver(Long userId) {
        return null;
    }
}
