package com.example.student_library_management_system.model;

import com.example.student_library_management_system.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int page;

    @Column(name = "publisher_name", nullable = false)
    private String publisherName;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Genre genre;  // have fixed value so created enums

    @Column(name = "is_available", nullable = false)
    private boolean available;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Card card;

    @OneToMany(mappedBy = "book")
    List<Transaction> transactions = new ArrayList<>();
}
