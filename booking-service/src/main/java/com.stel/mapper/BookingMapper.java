package com.stel.mapper;

import com.stel.dto.BookingDTO;
import com.stel.model.Booking;

public class BookingMapper {

    public static BookingDTO toDTO(Booking booking){
        BookingDTO bookingDTO=new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setCustomerId(booking.getCustomerId());
        bookingDTO.setStatus(booking.getStatus());
        bookingDTO.setEndTime(booking.getEndTime());
        bookingDTO.setSalonId(booking.getSalonId());
        bookingDTO.setStartTime(booking.getStartTime());
        bookingDTO.setServiceIds(booking.getServiceIds());

        return  bookingDTO;
    }

}
