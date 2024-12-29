package com.example.student_library_management_system.repository;

import com.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping( "/transaction/apis")
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}