package com.saket.projecct.uber.uberApp.services.impl;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.RideDto;
import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.services.RiderService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public Driverdto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public Driverdto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyAllRides() {
        return List.of();
    }
}
