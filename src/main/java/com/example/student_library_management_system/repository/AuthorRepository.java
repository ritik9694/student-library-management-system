package com.example.student_library_management_system.repository;

import com.example.student_library_management_system.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping( "/author/apis")
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
