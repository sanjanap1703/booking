package com.sbp.booking.repository;



import com.sbp.booking.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByCustomerId(Long customerId);
    List<Trip> findByPublisherId(Long publisherId);
}
