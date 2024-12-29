package com.example.student_library_management_system.requestdto;

import lombok.Data;

@Data
public class StudentRequestDto {

    private String name;
    private String dob;
    private String gender;
    private String email;
    private String department;
    private String sem;

}
