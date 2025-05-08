package com.yehorychev.interviewapp.dao.dao;

import com.yehorychev.interviewapp.model.model.InterviewQuestion;

import java.util.List;

public interface InterviewQuestionStorage {

    InterviewQuestion createInterviewQuestion(InterviewQuestion question);

    List<InterviewQuestion> getAll();
}