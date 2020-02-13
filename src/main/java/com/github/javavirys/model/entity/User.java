package com.github.javavirys.model.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {

    private int id;

    @NonNull
    private String name;

    private String additionalInformation;
}