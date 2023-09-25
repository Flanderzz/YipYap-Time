package com.chatApp.webSocketAPI.service;

import com.chatApp.webSocketAPI.Exception.UserException;
import com.chatApp.webSocketAPI.model.User;
import com.chatApp.webSocketAPI.request.UpdateUserRequest;

import java.util.List;

public interface UserService {
    public User findByID(Integer ID) throws UserException;
    public User findUserProfile(String jwt) throws UserException;
    public List<User> searchUsers(String query);
    public User updateUser (Integer ID, UpdateUserRequest request) throws UserException;
}
