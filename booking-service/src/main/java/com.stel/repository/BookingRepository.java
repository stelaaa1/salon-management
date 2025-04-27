package com.stel.repository;

import com.stel.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByCustomerId(Long customerId);

    List<Booking> findBySalonId(Long salonId);

//    List<Booking> findBySalonIdAndStartTimeBetween(Long salonId, java.time.LocalDateTime start, java.time.LocalDateTime end);
//
//
}
