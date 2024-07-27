package com.saket.projecct.uber.uberApp.strategies;

import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
