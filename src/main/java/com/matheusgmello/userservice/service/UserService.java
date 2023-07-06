package com.matheusgmello.userservice.service;

import com.matheusgmello.userservice.domain.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}