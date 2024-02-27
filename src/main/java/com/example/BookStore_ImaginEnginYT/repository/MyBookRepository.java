package com.example.BookStore_ImaginEnginYT.repository;

import com.example.BookStore_ImaginEnginYT.entity.Book;
import com.example.BookStore_ImaginEnginYT.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {
}
