package com.github.javavirys.view;

import com.github.javavirys.MainContract;
import com.github.javavirys.model.entity.User;
import lombok.NonNull;

import java.util.List;

public class MainView implements MainContract.View {

    @Override
    public void showUsersInformation(@NonNull List<User> users) {
        System.out.println("showUsersInformation: " + users);
    }

    @Override
    public void showError(Exception exception) {
        System.out.println("showError: " + exception);
    }
}
