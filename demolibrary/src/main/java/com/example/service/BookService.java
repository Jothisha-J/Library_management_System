package com.example.service;

import java.util.List;

import com.example.model.Book;

public interface BookService {
    public boolean insert();
    public List<Book> select();
    public Book searchOne(int id);
    public boolean change(Book b);
    public boolean remove(int id);

}
