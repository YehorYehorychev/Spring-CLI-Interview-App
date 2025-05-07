package com.yehorychev.interviewapp.config;

import com.yehorychev.interviewapp.components.ComponentA;
import com.yehorychev.interviewapp.components.ComponentB;
import com.yehorychev.interviewapp.components.ComponentDependsOnAAndB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public ComponentA componentA() {
        return new ComponentA();
    }

    @Bean
    public ComponentB componentB() {
        return new ComponentB();
    }

    @Bean
    public ComponentDependsOnAAndB componentDependsOnAAndB(ComponentA componentA, ComponentB componentB) {
        return new ComponentDependsOnAAndB(componentA, componentB);
    }

// Another approach
//    @Bean
//    public ComponentDependsOnAAndB componentDependsOnAAndB() {
//        return new ComponentDependsOnAAndB(componentA(), componentB());
//    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
