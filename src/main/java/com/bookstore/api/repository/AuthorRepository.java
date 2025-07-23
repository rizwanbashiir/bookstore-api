package com.bookstore.api.repository;

import com.bookstore.api.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // You can also define custom queries here if needed
}

