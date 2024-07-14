package com.chien.springbootmall.service;


import com.chien.springbootmall.dto.UserLoginRequest;
import com.chien.springbootmall.dto.UserRegisterRequest;
import com.chien.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
