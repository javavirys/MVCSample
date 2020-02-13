package com.github.javavirys.model.repository;

import com.github.javavirys.model.entity.User;
import lombok.NonNull;

import java.util.List;

public class JsonUserRepository implements UserRepository {

    @NonNull
    @Override
    public User getUserById(int id) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @Override
    public List<User> getAllUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void saveUser(@NonNull User user) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeUser(@NonNull User user) {
        throw new UnsupportedOperationException();
    }
}
