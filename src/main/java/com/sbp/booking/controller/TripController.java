package com.sbp.booking.controller;


import com.sbp.booking.model.*;
import com.sbp.booking.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sbp.booking.service.*;
import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private TripServiceImpl tripService;
    @PostMapping("/create")
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }

    @GetMapping("/getAllTrips")
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("getTrip/{id}")
    public Trip getTripById(@PathVariable Long id) {
        return tripService.getTripById(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Trip> getTripsByCustomerId(@PathVariable Long customerId) {
        return tripService.getTripsByCustomerId(customerId);
    }

    @GetMapping("/publisher/{publisherId}")
    public List<Trip> getTripsByPublisherId(@PathVariable Long publisherId) {
        return tripService.getTripsByPublisherId(publisherId);
    }

    @DeleteMapping("deleteTrip/{id}")
    public void deleteTrip(@PathVariable Long id) {
        tripService.deleteTrip(id);
    }
}
