import java.util.ArrayList;

public class Lab10 {
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

class Question extends ChoiceQuestion {
    private String text;
    private String answer;

    Question() {
        super();
    }

    Question(String t, String a) {
        this.text = t;
        this.answer = a;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String a) {
        return a.equals(this.answer);
    }

    @Override
    public void display() {
        System.out.println(this.text);
        super.display();
    }
}

class ChoiceQuestion {
    private ArrayList<String> choices;

    ChoiceQuestion() {
        this.choices = new ArrayList<String>();
    }

    ChoiceQuestion(ArrayList<String> choices) {
        this.choices = choices;
    }

    public void addChoice(String c, boolean b) {
        this.choices.add(c);
    }

    public void display() {
        for (String choice : this.choices) {
            System.out.printf("* %s\n", choice);
        }
    }
}
