package com.yehorychev.interviewapp.config;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlobalDataProcessor {

    private final List<DataProcessor> dataProcessors;

    public GlobalDataProcessor(List<DataProcessor> dataProcessors) {
        this.dataProcessors = dataProcessors;
    }

    public void runAllProcessors() {
        dataProcessors.forEach(DataProcessor::process);
    }
}
