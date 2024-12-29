package com.example.student_library_management_system.converters;

import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.requestdto.BookRequestDto;

public class BookConverter {

    public static Book convertBookRequestdtoIntoBook(BookRequestDto bookRequestDto){
        Book book = Book.builder()
                .name(bookRequestDto.getName())
                .page(bookRequestDto.getPage())
                .publisherName(bookRequestDto.getPublisherName())
                .genre(bookRequestDto.getGenre())
                .available(bookRequestDto.isAvailable())
                .build();
        return book;
    }
}
