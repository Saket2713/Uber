package com.saket.projecct.uber.uberApp.strategies.impl;

import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.entities.Driver;
import com.saket.projecct.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
