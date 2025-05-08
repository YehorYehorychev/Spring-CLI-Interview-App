package com.yehorychev.interviewapp.cliinterviewapp.dao.inmemory;

import com.yehorychev.interviewapp.cliinterviewapp.dao.InterviewQuestionStorage;
import com.yehorychev.interviewapp.cliinterviewapp.model.InterviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryInterviewQuestionStorage implements InterviewQuestionStorage {

    private final AtomicLong lastIdentifier;

    private final Map<Long, InterviewQuestion> storage;

    public InMemoryInterviewQuestionStorage() {
        this.lastIdentifier = new AtomicLong(0);
        this.storage = new ConcurrentHashMap<>();
    }

    @Override
    public InterviewQuestion createInterviewQuestion(InterviewQuestion question) {
        Long id = generateId();
        InterviewQuestion interviewQuestion = new InterviewQuestion(id, question.getQuestion(), question.getAnswer());
        storage.put(id, interviewQuestion);
        return interviewQuestion;
    }

    @Override
    public List<InterviewQuestion> getAll() {
        return new ArrayList<>(storage.values());
    }

    private Long generateId() {
        return lastIdentifier.addAndGet(1L);
    }
}
