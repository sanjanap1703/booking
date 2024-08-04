package com.sbp.booking.service;


import com.sbp.booking.model.*;

import java.util.List;

interface TripService {
    Trip saveTrip(Trip trip);
    List<Trip> getAllTrips();
    Trip getTripById(Long id);
    List<Trip> getTripsByCustomerId(Long customerId);
    List<Trip> getTripsByPublisherId(Long publisherId);
    void deleteTrip(Long id);
}
