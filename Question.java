package QuizDemo;

public class Question {
    private String question;
    private String[] options;
    private int correctOption;
    private int difficultyLevel;

    // Getters and setter methods
    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    
    // Constructor
    public Question(String question, int difficultyLevel) {
        this.question = question;
        this.options = new String[4];
        this.correctOption = -1;
        this.difficultyLevel = difficultyLevel;
    }

    // Method to add options to the question
    public void addOptions(String opt1, String opt2, String opt3, String opt4, int c) {
        options[0] = opt1;
        options[1] = opt2;
        options[2] = opt3;
        options[3] = opt4;
        correctOption = c;
    }

    // Method to print options for the questions
    public void printOptions() {
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Your answer (Enter a number [1,4]): ");
    }

    // Getter and setter methods
    public String getQuestion() {
        return question;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}
