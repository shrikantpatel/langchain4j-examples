package dev.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class EmployeeBenefitGuideApp implements CommandLineRunner {

    @Autowired
    EmployeeBenefitGuide employeeBenefitGuide;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBenefitGuideApp.class, args);
    }

    @Override
    public void run(String... args) throws IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String employeeQuestions = reader.readLine();
            interact(employeeBenefitGuide, employeeQuestions);
        }
    }


    private static void interact(EmployeeBenefitGuide agent, String userMessage) {
        System.out.println("==========================================================================================");
        System.out.println("[User]: " + userMessage);
        System.out.println("==========================================================================================");
        String agentAnswer = agent.chat(userMessage);
        System.out.println("==========================================================================================");
        System.out.println("[Agent]: " + agentAnswer);
        System.out.println("==========================================================================================");
    }
}
