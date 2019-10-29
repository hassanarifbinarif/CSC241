import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChoiceQuestion question1 = new ChoiceQuestion();
        question1.addChoice("Answer 1", false);
        question1.addChoice("Answer 2", false);
        question1.display();

        Question question2 = new Question("Question Text", "Answer 2");
        question2.addChoice("Answer 1", false);
        question2.addChoice("Answer 2", false);
        question2.display();

        System.out.println(question2.checkAnswer("Answer 2"));
    }
}

