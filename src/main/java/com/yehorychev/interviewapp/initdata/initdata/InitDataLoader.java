package com.yehorychev.interviewapp.initdata.initdata;

import com.yehorychev.interviewapp.controller.controller.InterviewQuestionController;
import com.yehorychev.interviewapp.dto.dto.InterviewQuestionDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;


@Service
public class InitDataLoader {
    private final InterviewQuestionController interviewQuestionController;

    public InitDataLoader(InterviewQuestionController interviewQuestionController) {
        this.interviewQuestionController = interviewQuestionController;
    }

    @PostConstruct
    private void init() {
        loadTestData();
    }

    private void loadTestData() {
        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the difference between manual and automated testing?",
                "Manual testing is performed by a human without using tools, while automated testing uses scripts and tools like Selenium or Appium to test applications."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is Selenium?",
                "Selenium is a popular open-source tool for automating web browsers. It supports multiple programming languages like Java, Python, and C#."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is a test case?",
                "A test case is a set of conditions or steps used to determine if a feature of an application is working correctly."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the Page Object Model?",
                "Page Object Model (POM) is a design pattern in Selenium that creates an object repository for storing all web elements. It improves code reusability and maintenance."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the difference between assert and verify in test automation?",
                "Assert stops the test execution if the condition fails, while verify logs the failure but allows the test to continue."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What are locators in Selenium?",
                "Locators are used to find elements on a web page. Examples: id, name, className, tagName, linkText, partialLinkText, xpath, and cssSelector."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is TestNG?",
                "TestNG is a testing framework inspired by JUnit and NUnit, used for running tests, generating reports, and organizing test cases."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the use of @FindBy in Selenium?",
                "@FindBy is used with PageFactory in Selenium to define element locators using annotations."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is an XPath?",
                "XPath is a language used to locate nodes in an XML document. In Selenium, it's used to find elements on a web page."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the difference between implicit and explicit wait in Selenium?",
                "Implicit wait waits for a defined time globally, while explicit wait waits for a certain condition to occur before proceeding."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is Appium?",
                "Appium is an open-source tool used for automating mobile apps on Android and iOS platforms."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("How do you handle alerts in Selenium?",
                "Use the Alert interface. Example: driver.switchTo().alert().accept();"));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is a test suite?",
                "A test suite is a collection of test cases that are intended to be executed together."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is Jenkins used for in QA Automation?",
                "Jenkins is a CI/CD tool used to automate the execution of tests, building code, and deploying applications."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is a headless browser?",
                "A headless browser is a web browser without a GUI, used for running automation tests faster."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What are the benefits of automation testing?",
                "Faster execution, reusability, reliability, coverage, and less manual effort."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is CI/CD in the context of automation?",
                "CI/CD stands for Continuous Integration and Continuous Deployment. It automates code integration, testing, and deployment."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is an assertion in testing?",
                "An assertion checks if a condition is true. If false, it marks the test as failed."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the difference between smoke and regression testing?",
                "Smoke testing checks basic functionality, while regression testing ensures that new changes didn’t break existing features."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is a test framework?",
                "A test framework provides structure and guidelines for writing and managing automated tests."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("How do you handle dynamic elements in Selenium?",
                "Use dynamic XPath or wait mechanisms like WebDriverWait to locate changing elements."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is data-driven testing?",
                "Data-driven testing is a framework where test data is stored externally (e.g., Excel, CSV), and the test scripts use this data."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is the purpose of a test report?",
                "A test report shows the results of executed tests, highlighting passed, failed, and skipped tests."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What tools do you use for mobile test automation?",
                "Appium, Espresso (Android), and XCUITest (iOS) are common tools for mobile automation."));

        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto("What is BDD and what tools support it?",
                "BDD stands for Behavior Driven Development. Tools like Cucumber and Behave allow writing test cases in natural language (Gherkin syntax)."));

        System.out.println("INFO: 25 QA automation interview questions loaded." + System.lineSeparator());
    }
}