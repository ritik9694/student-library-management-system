package com.example.student_library_management_system.converters;

import com.example.student_library_management_system.model.Student;
import com.example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {
//    converter arebused to convert the coming input request dto  into the model or entity class which directly represents database
    //converts  StudentRequestDto into Student class

    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto) {
        Student student = Student.builder().name(studentRequestDto.getName()).email(studentRequestDto.getEmail())
                .dob(studentRequestDto.getDob()).department(studentRequestDto.getDepartment())
                .gender(studentRequestDto.getGender()).sem(studentRequestDto.getSem()).build();

        return student;
    }
}
