package com.hotel.hotelService.services.serviceImpl;

import com.hotel.hotelService.entities.Hotel;
import com.hotel.hotelService.exceptions.ResourceNotFoundException;
import com.hotel.hotelService.repository.HotelRepo;
import com.hotel.hotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepo hotelRepo;


    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> findAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel findHotelById(String hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel not Found"));
    }
}
