package com.saket.projecct.uber.uberApp.services;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.RideDto;
import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);


    Driverdto  rateRider(Long rideId, Integer rating);
    Driverdto getMyProfile();
    List<RideDto> getMyAllRides();
}
