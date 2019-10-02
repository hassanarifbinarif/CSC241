
public class LabTask {

    public static void main(String[] args) {
        System.out.println(RandomCharacter.getRandomLowerCase());
    }
}

class RandomCharacter {

    public static char getRandomCharacter() {
        return (char) (Math.random() * 65536);
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(Math.random() * (max-min +1) +min);
    }

    public static char getRandomLowerCase() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCase() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigit() {
        return getRandomCharacter('0', '9');
    }
}
