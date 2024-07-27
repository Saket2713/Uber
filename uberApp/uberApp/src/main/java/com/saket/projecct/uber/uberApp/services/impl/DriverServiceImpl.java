package com.saket.projecct.uber.uberApp.services.impl;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.RideDto;
import com.saket.projecct.uber.uberApp.dto.RiderDto;
import com.saket.projecct.uber.uberApp.services.DriverService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId) {
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
