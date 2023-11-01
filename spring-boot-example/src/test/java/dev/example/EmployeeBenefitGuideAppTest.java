package dev.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeBenefitGuideAppTest {

    @Autowired
    EmployeeBenefitGuide guide;

    @Test
    void guideThroughTheirBenefitQuestions() {

        // Please define API keys in application.properties before running this test.
        // Tip: Use gpt-4 for this example, as gpt-3.5-turbo tends to hallucinate often and invent name and surname.

        interact(guide, "Hi, I employee of kin and carta. I need with deciding which health insurance to use");
        interact(guide, "I am 35 and very healthy. I like to keep my insurance cost low. Which insurance plan you recommend");

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
