package com.saket.projecct.uber.uberApp.strategies;

import com.saket.projecct.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
