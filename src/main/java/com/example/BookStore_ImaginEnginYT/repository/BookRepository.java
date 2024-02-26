package com.example.BookStore_ImaginEnginYT.repository;

import com.example.BookStore_ImaginEnginYT.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
