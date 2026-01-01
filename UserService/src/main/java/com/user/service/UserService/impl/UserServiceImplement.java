package com.user.service.UserService.impl;

import com.user.service.UserService.entities.Hotel;
import com.user.service.UserService.entities.Rating;
import com.user.service.UserService.entities.User;
import com.user.service.UserService.external.services.HotelService;
import com.user.service.UserService.external.services.RatingService;
import com.user.service.UserService.repository.UserRepo;
import com.user.service.UserService.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    HotelService hotelService;

    @Autowired
    RatingService ratingService;

    private Logger logger = LoggerFactory.getLogger(UserServiceImplement.class);

    @Override
    public User saveUser(User user) {
//        String uuid = UUID.randomUUID().toString();
//        user.setUserId(uuid);
        return userRepo.save(user);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(String id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User with given id not found " + id));
        //call rating
        //from http://localhost:8083/api/rating/user/3aa9ba30-0786-4843-9703-d8a0c75008f2
//        Rating[] objects = restTemplate.getForObject("http://RATING-SERVICE/api/rating/user/"+user.getUserId(), Rating[].class);
        List<Rating> ratings = ratingService.findByUserId(user.getUserId());
        List<Rating> hotelAdded=ratings.stream().map(rating->{
//            ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotels/"+rating.getHotelId(), Hotel.class);
            Hotel hotel=hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
            return rating;
        }).toList();
        user.setRatings(hotelAdded);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
}
