package com.chatApp.webSocketAPI.repository;

import com.chatApp.webSocketAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository <User, Integer> {
}
