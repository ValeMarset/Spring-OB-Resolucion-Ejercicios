package com.ejercicioDos;

import org.springframework.stereotype.Component;


@Component
public class UserService {

    NotificationService notification;

    public UserService(NotificationService notification){
        this.notification = notification;

    }



}
