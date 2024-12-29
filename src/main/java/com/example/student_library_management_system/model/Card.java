package com.example.student_library_management_system.model;

import com.example.student_library_management_system.enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Card {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "card_status", nullable = false)
    @Enumerated(EnumType.STRING)    //value will be take from cardStatus --->>> enum
    private CardStatus cardStatus;     //active deactivate blocked expired

    @Column(name = "create_date", nullable = false)
    @CreationTimestamp
    private Date createDate;

    @Column(name = "update_date", nullable = false)
    @UpdateTimestamp
    private Date updateDate;

    @JsonBackReference
    @OneToOne
    @JoinColumn //it joins the primary key of student table as foreign key as card table -->only id will taken from student
    private Student student;

    @OneToMany(mappedBy = "card")
    private List<Book> booksIssuedToCard = new ArrayList<>();

    @OneToMany(mappedBy = "card")
    private List<Transaction> transactionsForCard = new ArrayList<>();
}
