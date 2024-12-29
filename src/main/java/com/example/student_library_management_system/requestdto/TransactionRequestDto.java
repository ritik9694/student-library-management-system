package com.example.student_library_management_system.requestdto;

import com.example.student_library_management_system.enums.TransactionStatus;

import lombok.Data;

@Data
public class TransactionRequestDto {

    private TransactionStatus transactionStatus;
    private double fine;
    private boolean IssueOrReturn;
    private String dueDate;
    private int bookId;
    private int cardId;

}
