package com.github.javavirys.factory;

import com.github.javavirys.MainContract;
import com.github.javavirys.controller.MainController;
import com.github.javavirys.model.repository.UserRepository;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ControllerFactory {

    @NonNull
    public MainContract.Controller createMainController(@NonNull MainContract.View view,
                                                        @NonNull UserRepository userRepository) {
        return new MainController(view, userRepository);
    }
}
