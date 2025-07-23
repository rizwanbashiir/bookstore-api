package com.bookstore.api.repository;

import com.bookstore.api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Example: Find books by title containing a keyword
    Page<Book> findByTitleContaining(String keyword, Pageable pageable);
}
