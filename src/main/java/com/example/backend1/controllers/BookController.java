package com.example.backend1.controllers;

import com.example.backend1.model.*;
import com.example.backend1.repos.DAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class BookController {

    private DAO db = new DAO();
    private List<Book> books = db.getAllBooks();

    @RequestMapping( "/books")
    public List<Book> getAllBooks(){
        return books;
    }

    @RequestMapping("/book/{id}")
    public Message getBookById(@RequestParam int id){
        for(Book b : books){
            if(b.getId() == id) {
                String message = String.format("Book found: %s - %s", b.getAuthor(), b.getTitle());
                return new Message(true, message);
            };
        }
        return null;
    }
}
