package com.devteria.identityservice.service;

import com.devteria.identityservice.dto.request.UserRequest;
import com.devteria.identityservice.dto.request.UserUpdateRequest;
import com.devteria.identityservice.dto.response.UserResponse;
import com.devteria.identityservice.entity.User;

import java.util.List;

public interface UserService {

    User createUser(UserRequest userRequest);

    List<User> getUsers();

    UserResponse getUser(String userId);

    User updateUser(String userId, UserUpdateRequest userUpdateRequest);

    void deleteUser(String userId);

}
