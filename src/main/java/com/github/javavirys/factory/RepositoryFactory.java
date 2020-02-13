package com.github.javavirys.factory;

import com.github.javavirys.model.repository.JsonUserRepository;
import com.github.javavirys.model.repository.MySqlUserRepository;
import com.github.javavirys.model.repository.UserRepository;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RepositoryFactory {

    @NonNull
    public UserRepository createMySqlUserRepository() {
        return new MySqlUserRepository();
    }

    @NonNull
    public UserRepository createJsonUserRepository() {
        return new JsonUserRepository();
    }
}