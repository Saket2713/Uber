package com.saket.projecct.uber.uberApp.dto;

import com.saket.projecct.uber.uberApp.entities.Driver;
import com.saket.projecct.uber.uberApp.entities.Rider;
import com.saket.projecct.uber.uberApp.entities.enums.PayementMethod;
import com.saket.projecct.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;
    private Driverdto driver;

    private PayementMethod payementMethod;

    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
