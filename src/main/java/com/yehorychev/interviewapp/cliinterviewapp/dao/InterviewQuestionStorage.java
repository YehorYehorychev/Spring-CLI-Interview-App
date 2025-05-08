package com.yehorychev.interviewapp.cliinterviewapp.dao;

import com.yehorychev.interviewapp.cliinterviewapp.model.InterviewQuestion;

import java.util.List;

public interface InterviewQuestionStorage {

    InterviewQuestion createInterviewQuestion(InterviewQuestion question);

    List<InterviewQuestion> getAll();
}