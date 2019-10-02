class LabTask2 {
  public static void main(String[] args) {
    System.out.println(RandomCharacter.getRandomLowerCase());
  }
}

class RandomCharacter {
  public static char getRandomCharacter(){
    return (char) (Math.random() * 65536);
  }

  public static char getRandomCharacter(char ch1, char ch2){
    return Math.random() < .5 ? ch1 : ch2;
  }

  public static char getRandomLowerCase(){
    int max = 122, min = 97;
    return (char)(Math.random() * (max-min +1) +min);
  }

  public static char getRandomUpperCase(){
    int max = 67, min = 90;
    return (char)(Math.random() * (max-min +1) +min);
  }

  public static char getRandomDigit(){
    int max = 48, min = 57;
    return (char)(Math.random() * (max-min +1) +min);
  }
}
