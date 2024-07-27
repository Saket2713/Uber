package com.saket.projecct.uber.uberApp.services;

import com.saket.projecct.uber.uberApp.dto.Driverdto;
import com.saket.projecct.uber.uberApp.dto.RideDto;
import com.saket.projecct.uber.uberApp.dto.RideRequestDto;
import com.saket.projecct.uber.uberApp.entities.Driver;
import com.saket.projecct.uber.uberApp.entities.Ride;
import com.saket.projecct.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RideService {

    RideDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);


    Driverdto rateRider(Long rideId, Integer rating);
    Driverdto getMyProfile();
    List<RideDto> getMyAllRides();

    Ride getRideById(Long rideId);
    void matchWithDriver(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRide(Long RideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
