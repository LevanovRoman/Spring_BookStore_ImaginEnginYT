package com.example.BookStore_ImaginEnginYT.service;

import com.example.BookStore_ImaginEnginYT.entity.Book;
import com.example.BookStore_ImaginEnginYT.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b){
        bRepo.save(b);
    }

    public List<Book> getAllBook(){
        return bRepo.findAll();
    }
}
