package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class Post {

    private  Long id;
    private  Long author;
    private  String description;
    private  Instant postDate;
}
