package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class User {

    private final Long id;
    private final String userName;
    private final String email;
    private final String password;
    private final Instant registrationDate;

}
