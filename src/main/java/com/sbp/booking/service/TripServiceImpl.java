package com.sbp.booking.service;
import com.sbp.booking.model.*;
import com.sbp.booking.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    private TripRepository tripRepository;

    @Override
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getTripById(Long id) {
        return tripRepository.findById(id).orElse(null);
    }

    @Override
    public List<Trip> getTripsByCustomerId(Long customerId) {
        return tripRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Trip> getTripsByPublisherId(Long publisherId) {
        return tripRepository.findByPublisherId(publisherId);
    }

    @Override
    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }
}
