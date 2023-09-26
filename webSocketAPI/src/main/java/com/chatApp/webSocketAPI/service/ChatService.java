package com.chatApp.webSocketAPI.service;

import com.chatApp.webSocketAPI.model.Chat;

public interface ChatService {

    public Chat createChat(Integer requestedUserID, Integer UserID);

}
