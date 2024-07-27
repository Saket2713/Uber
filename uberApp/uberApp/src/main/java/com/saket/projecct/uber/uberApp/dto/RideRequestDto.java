package com.saket.projecct.uber.uberApp.dto;

import com.saket.projecct.uber.uberApp.entities.enums.PayementMethod;
import com.saket.projecct.uber.uberApp.entities.enums.RideRquestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
    private Long id;


    private Point pickupLocation;


    private Point dropOffLocation;


    private LocalDateTime requestedTime;


    private RiderDto rider;


    private PayementMethod payementMethod;


    private RideRquestStatus rideRquestStatus;
}
