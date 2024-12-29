package com.example.student_library_management_system.requestdto;

import com.example.student_library_management_system.enums.CardStatus;

import com.example.student_library_management_system.model.Student;
import lombok.Data;


@Data
public class CardRequestDto {

    private CardStatus cardStatus;     //active deactivate blocked expired
    private Student student;

}
