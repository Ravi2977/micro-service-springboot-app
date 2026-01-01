package com.rating.ratingService.services.impl;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.repositories.RatingRepo;
import com.rating.ratingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ratingServiceImpl implements RatingService {

    @Autowired
    RatingRepo ratingRepo;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public Rating findById(String ratingId) {
        return ratingRepo.findById(ratingId).get();
    }

    @Override
    public List<Rating> findAllByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> findAllByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
