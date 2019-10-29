import java.util.ArrayList;

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
