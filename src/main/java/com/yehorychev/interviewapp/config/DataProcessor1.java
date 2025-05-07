package com.yehorychev.interviewapp.config;

import org.springframework.stereotype.Service;

@Service
public class DataProcessor1 implements DataProcessor {

    @Override
    public void process() {
        System.out.println(getClass().getName() + " is processing data");
    }
}
