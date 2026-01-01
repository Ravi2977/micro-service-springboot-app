package com.hotel.hotelService.controllers;

import com.hotel.hotelService.entities.Hotel;
import com.hotel.hotelService.services.serviceImpl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;


    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
     return new ResponseEntity<>(hotelService.createHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return new ResponseEntity<>(hotelService.findAllHotels(), HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
        return new ResponseEntity<>(hotelService.findHotelById(hotelId), HttpStatus.OK);
    }
}
