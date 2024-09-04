package com.app.Service.Impl;

import com.app.Repository.UserRepository;
import com.app.Service.UserService;
import com.app.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }
}