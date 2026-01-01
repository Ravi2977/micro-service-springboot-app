package com.user.service.UserService.services;

import com.user.service.UserService.entities.User;
import com.user.service.UserService.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    //All Users Operations will be performed here
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(String id);
    User findByEmail(String email);

}
