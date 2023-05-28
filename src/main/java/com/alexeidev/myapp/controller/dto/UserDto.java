package com.alexeidev.myapp.controller.dto;

import com.alexeidev.myapp.repository.model.UserEntity;

import java.util.UUID;

public class UserDto {

    private String name;

    public UserDto(){}

    public UserEntity mapper() {
        return new UserEntity(UUID.randomUUID(), this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
