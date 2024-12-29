package com.example.student_library_management_system.service;

import com.example.student_library_management_system.converters.BookConverter;
import com.example.student_library_management_system.model.Author;
import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.model.Card;
import com.example.student_library_management_system.repository.AuthorRepository;
import com.example.student_library_management_system.repository.BookRepository;
import com.example.student_library_management_system.repository.CardRepository;
import com.example.student_library_management_system.requestdto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired // book repros
    private BookRepository bookRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public String addBook(BookRequestDto bookRequestDto) {
        Book book = BookConverter.convertBookRequestdtoIntoBook(bookRequestDto);

//        from autorId get whole author details
        Author author = authorRepository.findById((long) bookRequestDto.getAuthorId()).get();
        book.setAuthor(author);
        //from cardId get whole card details
        Card card = cardRepository.findById((long) bookRequestDto.getCardId()).get();
        book.setCard(card);

        bookRepository.save(book);
        return "Book saved into dataBase";
    }
}
