package com.rating.ratingService.controllers;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating){
        return new ResponseEntity<>(ratingService.createRating(rating), HttpStatus.CREATED);
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String id){
        return new ResponseEntity<>(ratingService.findAllByHotelId(id),HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Rating>> getRatingBYUserId(@PathVariable String id){
        return new ResponseEntity<>(ratingService.findAllByUserId(id),HttpStatus.OK);
    }

    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating> findAll(@PathVariable String ratingId){
        return new ResponseEntity<>(ratingService.findById(ratingId),HttpStatus.OK);
    }

}
