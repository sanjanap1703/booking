package com.sbp.booking.model;



import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ride {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rideId;
	

    @Column(nullable = false)
    private String rideSource;

    @Column(nullable = false)
    private String rideDestination;

    @Column(nullable = false)
    private int rideFare;

    @Column(nullable = false)
    private LocalDateTime rideDate;
    
    @Column(nullable = false)
    private int carId;
    
 // userId
    // carId

	public int getRideId() {
		return rideId;
	}

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public String getRideSource() {
		return rideSource;
	}

	public void setRideSource(String rideSource) {
		this.rideSource = rideSource;
	}

	public String getRideDestination() {
		return rideDestination;
	}

	public void setRideDestination(String rideDestination) {
		this.rideDestination = rideDestination;
	}

	public int getRideFare() {
		return rideFare;
	}

	public void setRideFare(int rideFare) {
		this.rideFare = rideFare;
	}

	public LocalDateTime getRideDate() {
		return rideDate;
	}

	public void setRideDate(LocalDateTime rideDate) {
		this.rideDate = rideDate;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
    
    
	
    
	
}