package com.yehorychev.interviewapp;

import com.yehorychev.interviewapp.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/* IoC (Inversion of Control) in Spring means that the control of object creation and dependency management
 is given to the Spring container instead of the programmer.
 Spring creates, configures, and injects beans automatically based on annotations or XML configuration.

 IoC (Inversion of Control) in Spring means that objects don't create their own dependencies.
 Instead, the IoC container (like ApplicationContext) injects the required dependencies
 into components at creation time. This reverses the traditional flow of control and
 simplifies configuration and testing.*/
@SpringBootApplication
public class InterviewApplication implements CommandLineRunner {
    private final DemoService demoService;
    private final ApplicationContext applicationContext;

    public InterviewApplication(DemoService demoService, ApplicationContext applicationContext) {
        this.demoService = demoService;
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("================== " +
                applicationContext.getId() + " is running ==================");
        demoService.processData();

        DemoService demoServiceBean = applicationContext.getBean("demoService", DemoService.class);

//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames)
//                .forEach(System.out::println);
    }
}
