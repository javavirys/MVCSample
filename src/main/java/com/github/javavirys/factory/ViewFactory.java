package com.github.javavirys.factory;

import com.github.javavirys.MainContract;
import com.github.javavirys.view.MainView;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ViewFactory {

    @NonNull
    public MainContract.View createMainView() {
        return new MainView();
    }
}