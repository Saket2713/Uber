package com.saket.projecct.uber.uberApp.strategies.impl;

import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
