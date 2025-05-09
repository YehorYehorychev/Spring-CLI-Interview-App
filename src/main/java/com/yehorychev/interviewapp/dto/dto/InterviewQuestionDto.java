package com.yehorychev.interviewapp.dto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewQuestionDto {
    Long id;
    String question;
    String answer;

    public InterviewQuestionDto(String question, String answer) {
        this(null, question, answer);
    }
}