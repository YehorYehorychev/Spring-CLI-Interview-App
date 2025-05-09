package com.yehorychev.interviewapp.model.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class InterviewQuestion {
    private Long id;
    private String question;
    private String answer;

    public InterviewQuestion(String question, String answer) {
        this(null, question, answer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterviewQuestion that = (InterviewQuestion) o;
        return Objects.equals(id, that.id) && Objects.equals(question, that.question) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }
}