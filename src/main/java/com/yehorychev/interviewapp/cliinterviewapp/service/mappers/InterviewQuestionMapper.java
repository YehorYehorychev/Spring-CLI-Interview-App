package com.yehorychev.interviewapp.cliinterviewapp.service.mappers;

import com.yehorychev.interviewapp.cliinterviewapp.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.cliinterviewapp.model.InterviewQuestion;

public class InterviewQuestionMapper {

    public InterviewQuestion toInterviewQuestion(InterviewQuestionDto interviewQuestionDto) {
        return new InterviewQuestion(interviewQuestionDto.getQuestion(), interviewQuestionDto.getAnswer());
    }

    public InterviewQuestionDto toInterviewQuestionDto(InterviewQuestion interviewQuestion) {
        return new InterviewQuestionDto(interviewQuestion.getId(), interviewQuestion.getQuestion(), interviewQuestion.getAnswer());
    }
}
