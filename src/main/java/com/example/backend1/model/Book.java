package com.example.backend1.model;

import lombok.Data;

public @Data class Book {

    protected int id;
    protected String title;
    protected String author;

    public Book() {}

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
