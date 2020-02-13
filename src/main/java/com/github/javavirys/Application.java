package com.github.javavirys;

import com.github.javavirys.factory.ControllerFactory;
import com.github.javavirys.factory.RepositoryFactory;
import com.github.javavirys.factory.ViewFactory;
import lombok.var;

public class Application {

    public static void main(String[] args) {
        var mainView = ViewFactory.createMainView();
        var userRepository = RepositoryFactory.createMySqlUserRepository();
        var mainController = ControllerFactory.createMainController(mainView, userRepository);
        mainController.actionMain();
    }
}
