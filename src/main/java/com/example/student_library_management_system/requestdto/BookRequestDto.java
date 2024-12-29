package com.example.student_library_management_system.requestdto;

import com.example.student_library_management_system.enums.Genre;

import lombok.Data;

@Data
public class BookRequestDto {

    private String name;
    private int page;
    private String publisherName;
    private Genre genre;  // have fixed value so created enums
    private boolean isAvailable;
    private int authorId;
    private int cardId;
}
