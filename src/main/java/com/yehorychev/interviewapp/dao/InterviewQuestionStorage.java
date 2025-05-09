package com.yehorychev.interviewapp.dao;

import com.yehorychev.interviewapp.model.InterviewQuestion;

import java.util.List;

public interface InterviewQuestionStorage {

    InterviewQuestion createInterviewQuestion(InterviewQuestion question);

    List<InterviewQuestion> getAll();
}