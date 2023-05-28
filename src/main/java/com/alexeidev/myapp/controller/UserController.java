package com.alexeidev.myapp.controller;

import com.alexeidev.myapp.controller.dto.UserDto;
import com.alexeidev.myapp.repository.adapter.UserRepository;
import com.alexeidev.myapp.repository.model.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void saveUser() {
        List<UserEntity> list = new ArrayList();
        list.add(new UserEntity(UUID.randomUUID(), "Joao"));
        list.add(new UserEntity(UUID.randomUUID(), "Paulo"));
        list.add(new UserEntity(UUID.randomUUID(), "Josue"));
        list.add(new UserEntity(UUID.randomUUID(), "Edgar"));
        list.add(new UserEntity(UUID.randomUUID(), "Wagner"));
        list.add(new UserEntity(UUID.randomUUID(), "Pedro"));
        userRepository.saveAll(list);
    }

    @GetMapping("list")
    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @PostMapping("create")
    public UserEntity createUser(@RequestBody UserDto payload) {
        return userRepository.save(payload.mapper());
    }
}

