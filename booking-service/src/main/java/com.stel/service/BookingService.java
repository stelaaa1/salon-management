package com.stel.service;

import com.stel.dto.SalonDTO;
import com.stel.domain.BookingStatus;
import com.stel.dto.BookingRequest;
import com.stel.dto.SalonDTO;
import com.stel.dto.ServiceDTO;
import com.stel.dto.UserDTO;
import com.stel.model.Booking;

import com.stel.model.SalonReport;
import com.stel.service.impl.BookingServiceImpl;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface BookingService {

    Booking createBooking(BookingRequest booking,
                          UserDTO ser,
                          SalonDTO salon,
                          Set<ServiceDTO> serviceDTOSet) throws Exception;

    List<Booking> getBookingsByCustomer(Long customerId);

    List<Booking> getBookingsBySalon(Long salonId);

    Booking getBookingById(Long id) throws Exception;

    Booking updateBookingById(Long bookingId, BookingStatus status);

    List<Booking> getBookingsByDate(LocalDate date, Long salonId);

    SalonReport getSalonReport(Long salonId);

    Booking updateBooking(Long bookingId, BookingStatus status);

}
