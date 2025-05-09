package com.yehorychev.interviewapp.cli;

import com.yehorychev.interviewapp.api.InterviewQuestionController;
import com.yehorychev.interviewapp.dto.InterviewQuestionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class CommandLineInterface {
    public static final String ADD_INTERVIEW_QUESTION_MENU_TEXT = """
            ══════ Enter the question: ══════
                (or type 'menu' to return):
            """;
    private final InterviewQuestionController interviewQuestionController;
    public static final String APP_WELCOME_TEXT = "Welcome to the Java Interview App";

    public static final String APP_MENU_TEXT = """
            ╔════════════════════════════════════════════╗
            ║                Commands Menu               ║
            ╠════════════════════════════════════════════╣
            ║ 1. list  - List all questions              ║
            ║ 2. add   - Add a new question and answer   ║
            ║ 3. exit  - Exit the app                    ║
            ╚════════════════════════════════════════════╝
            Enter Command:
            """;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        CliCommands input;

        System.out.println(APP_WELCOME_TEXT);

        do {
            System.out.print(APP_MENU_TEXT);
            CliCommandParsingResult cliCommandParsingResult = getInputFromCli(scanner);
            if (!cliCommandParsingResult.successful()) {
                input = cliCommandParsingResult.cliCommand();
                System.out.println(cliCommandParsingResult.errorMessage);
            } else {
                input = cliCommandParsingResult.cliCommand();
                switch (input) {
                    case CliCommands.LIST ->
                            printAllInterviewQuestions(interviewQuestionController.getAllInterviewQuestions());
                    case CliCommands.ADD -> addInterviewQuestion(scanner);
                }
            }
        } while (!input.equals(CliCommands.EXIT));

/*        List<InterviewQuestionDto> allInterviewQuestions = interviewQuestionController.getAllInterviewQuestions();
        allInterviewQuestions.forEach(System.out::println);*/
    }

    private void addInterviewQuestion(Scanner scanner) {
        System.out.println(ADD_INTERVIEW_QUESTION_MENU_TEXT);

        System.out.println("Enter question:");
        String question = scanner.nextLine();
        if (question.equalsIgnoreCase(CliCommands.MENU.getLowerCaseName())) {
            return;
        }
        System.out.println("Enter your answer:");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(CliCommands.MENU.getLowerCaseName())) {
            return;
        }
        interviewQuestionController.createInterviewQuestion(new InterviewQuestionDto(question, answer));
    }

    private static void printAllInterviewQuestions(List<InterviewQuestionDto> questionDtos) {
        System.out.println(questionDtos.size() + " questions available" + System.lineSeparator());

        int questionNumber = 1;
        for (InterviewQuestionDto question : questionDtos) {
            System.out.println(questionNumber + " " + question + System.lineSeparator());
            questionNumber++;
        }
    }

    private CliCommandParsingResult getInputFromCli(Scanner scanner) {
        CliCommands command;
        try {
            String stringInput = scanner.nextLine().trim().toUpperCase();
            command = CliCommands.valueOf(stringInput);
            return new CliCommandParsingResult(command, true, null);
        } catch (IllegalArgumentException e) {
            return new CliCommandParsingResult(CliCommands.UNRECOGNIZED, false, "Unrecognized CLI command");
        }
    }

    private record CliCommandParsingResult(CliCommands cliCommand, boolean successful, String errorMessage) {
    }
}