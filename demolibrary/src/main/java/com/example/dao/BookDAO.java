package com.example.dao;
import java.util.List;

import com.example.model.Book;
    

public interface BookDAO {
    public boolean add(Book b);
    public List<Book> view();
    public Book search(int id);
    public boolean update(Book b);
    public boolean delete(int id);
    
}
