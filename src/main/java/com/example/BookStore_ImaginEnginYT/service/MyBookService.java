package com.example.BookStore_ImaginEnginYT.service;


import com.example.BookStore_ImaginEnginYT.entity.MyBookList;
import com.example.BookStore_ImaginEnginYT.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBookService {

    @Autowired
    private MyBookRepository mybook;

    public void saveMyBooks(MyBookList book){
        mybook.save(book);
    }
}
