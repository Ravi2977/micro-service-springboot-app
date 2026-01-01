package com.hotel.hotelService.services;

import com.hotel.hotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);

    //getAll

    List<Hotel> findAllHotels();
    //get Signle by id

    Hotel findHotelById(String hotelId);
}
