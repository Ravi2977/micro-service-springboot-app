package com.rating.ratingService.services;

import com.rating.ratingService.entities.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    Rating findById(String ratingId);
    List<Rating> findAllByUserId(String userId);
    List<Rating> findAllByHotelId(String hotelId);
}
