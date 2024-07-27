package com.saket.projecct.uber.uberApp.services;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.RideDto;
import com.saket.projecct.uber.uberApp.dto.RiderDto;

import java.util.List;


public interface DriverService {

    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId);
    Driverdto getMyProfile();
    List<RideDto> getMyAllRides();
}
