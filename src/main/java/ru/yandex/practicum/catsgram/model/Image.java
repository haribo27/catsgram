package ru.yandex.practicum.catsgram.model;

import lombok.Data;

@Data
public class Image {

    private final Long id;
    private final long postId;
    private final String originalFileName;
    private final String filePath;
}
