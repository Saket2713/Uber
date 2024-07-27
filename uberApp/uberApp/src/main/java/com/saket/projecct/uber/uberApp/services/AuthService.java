package com.saket.projecct.uber.uberApp.services;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.SignupDto;
import com.saket.projecct.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);

    Driverdto onboardNewDriver(Long userId);

}
