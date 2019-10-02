package javaapplication1;


public class LabTask {

    public static void main(String[] args) {
        
    }
}

class CountLettersInArray{

    private char[] arr;
    private int[] count;
   
    char[] createArray(){
        arr = new char[100];
        return arr;
    }
    
    void displayCharacterArray(){
        for(char a : arr){
            System.out.print(a+", ");
        }
    }
    
    void displayCountsArray(){
        for(int a : count){
            System.out.print(a+", ");
        }
    }
    
    int[] countCharacters(char[] ch){
        count = new int[26];
        for(int i = 0; i<26; i++){
            for(char a : ch){
               if(ch[i] == a)
                   count[i]++;
            }
        }
        return count;
    }
    
}

class RandomCharacter {

    public static char getRandomCharacter() {
        return (char) (Math.random() * 65536);
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return Math.random() < .5 ? ch1 : ch2;
    }

    public static char getRandomLowerCase() {
        int max = 122, min = 97;
        return (char) (Math.random() * (max - min + 1) + min);
    }

    public static char getRandomUpperCase() {
        int max = 67, min = 90;
        return (char) (Math.random() * (max - min + 1) + min);
    }

    public static char getRandomDigit() {
        int max = 48, min = 57;
        return (char) (Math.random() * (max - min + 1) + min);
    }
}
