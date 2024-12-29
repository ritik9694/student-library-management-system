package com.example.student_library_management_system.repository;

import com.example.student_library_management_system.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping( "/book/apis")
public interface BookRepository extends JpaRepository<Book, Integer> {
}
