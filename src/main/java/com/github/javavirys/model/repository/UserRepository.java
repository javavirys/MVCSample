package com.github.javavirys.model.repository;

import com.github.javavirys.model.entity.User;
import lombok.NonNull;

import java.util.List;

public interface UserRepository {

    @NonNull
    User getUserById(int id);

    @NonNull
    List<User> getAllUsers();

    void saveUser(@NonNull User user);

    void removeUser(@NonNull User user);
}