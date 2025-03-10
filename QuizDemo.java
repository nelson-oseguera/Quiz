package QuizDemo;

import java.util.Scanner;

public class QuizDemo {
    public static void main(String[] args) {
        // create a quiz object
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(System.in);

        // Add questions until the user decides to stop
        while (true) {
            quiz.addQuestion();

            System.out.println("Do you want to add another question? (yes/no)");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }
        }

        // take the quiz
        quiz.start();

     // Get the score and print the percentage
        int quizScore = quiz.getScore();
        int totalQuestions = quiz.getNumQuestions();
        double percentage = Math.ceil((double) quizScore / totalQuestions * 100);

        System.out.println("Score: " + quizScore);
        System.out.println("Number of questions: " + totalQuestions);
        System.out.println("The average score: " + percentage);
        
    }
}

