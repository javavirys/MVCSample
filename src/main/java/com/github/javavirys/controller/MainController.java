package com.github.javavirys.controller;

import com.github.javavirys.MainContract;
import com.github.javavirys.model.entity.User;
import com.github.javavirys.model.repository.UserRepository;
import lombok.NonNull;

import java.util.List;

public class MainController implements MainContract.Controller {

    @NonNull
    private final MainContract.View view;

    @NonNull
    private final UserRepository userRepository;

    public MainController(@NonNull MainContract.View view,
                          @NonNull UserRepository userRepository) {
        this.view = view;
        this.userRepository = userRepository;
    }

    @Override
    public void actionMain() {
        loadUsers();
    }

    private void loadUsers() {
        try {
            List<User> userList = userRepository.getAllUsers();
            view.showUsersInformation(userList);
        } catch (Exception ex) {
            processExceptions(ex);
        }
    }

    private void processExceptions(Exception exception) {
        view.showError(exception);
    }
}
