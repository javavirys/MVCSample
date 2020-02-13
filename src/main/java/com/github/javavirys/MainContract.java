package com.github.javavirys;

import com.github.javavirys.model.entity.User;
import lombok.NonNull;

import java.util.List;

public interface MainContract {

    interface View {

        void showUsersInformation(@NonNull List<User> users);

        void showError(Exception exception);
    }

    interface Controller {

        void actionMain();
    }
}
