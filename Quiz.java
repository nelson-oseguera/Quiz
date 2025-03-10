package QuizDemo;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    private String name;
    private int numQuestions;
    private Question[] questions;
    private int score;
    private Scanner keyboard;

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //Constructor
    public Quiz() {
        Random random = new Random();
        int threeDigitRandom = random.nextInt(900) + 100;
        name = "Quiz" + threeDigitRandom;
        numQuestions = 0;
        questions = new Question[5];
        keyboard = new Scanner(System.in);
    }

    // Method to add a question to the quiz
    public void addQuestion() {
        if (numQuestions == questions.length) {
            // Create a new array with double the length
            Question[] temp = new Question[questions.length * 2];
            
            // Copy elements from the old array to the new array
            for (int i = 0; i < numQuestions; i++) {
                temp[i] = questions[i];
            }

            questions = temp;
        }

        // Get questions from user input
        System.out.print("Enter the question: ");
        String question = keyboard.nextLine();
        System.out.print("Enter 4 options:\n1: ");
        String option1 = keyboard.nextLine();
        System.out.print("2: ");
        String option2 = keyboard.nextLine();
        System.out.print("3: ");
        String option3 = keyboard.nextLine();
        System.out.print("4: ");
        String option4 = keyboard.nextLine();
        System.out.print("Enter the correct option: ");
        int correct = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter difficulty level [1,10]: ");
        int level = Integer.parseInt(keyboard.nextLine());

        // Create a new question and add it to the array
        Question question1 = new Question(question, level);
        question1.addOptions(option1, option2, option3, option4, correct);
        questions[numQuestions++] = question1;
    }

 // Method to start the quiz
    public void start() {
        System.out.println("\nStart of the Quiz: ");
        for (int i = 0; i < numQuestions; i++) {
            System.out.println(questions[i].getQuestion());
            questions[i].printOptions();
            int user = keyboard.nextInt();
            if (user == questions[i].getCorrectOption()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
