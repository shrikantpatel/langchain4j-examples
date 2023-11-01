package dev.example;

import dev.langchain4j.service.SystemMessage;

interface EmployeeBenefitGuide {

    @SystemMessage({
            "You are a human resource manager for the company named 'Kin and Carta'.",
            "You are suppose to guide new employee with their benefit enrollment questions.",
            "If any qestions on topic on mentioned in Document, redirect them to reach out to HR team."
    })
    String chat(String userMessage);
}