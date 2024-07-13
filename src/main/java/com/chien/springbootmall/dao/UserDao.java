package com.chien.springbootmall.dao;

import com.chien.springbootmall.dto.UserRegisterRequest;
import com.chien.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);
}
