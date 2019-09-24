package lab5.task1;


import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number 1: ");
        double op1 = scanner.nextDouble();
        
        System.out.println("Enter Number 2: ");
        double op2 = scanner.nextDouble();
        
        System.out.println("Enter Choice: \n\'+\' to add\n\'-\' to subtract\n\'*\' to Multiply\n\'/\' to divide\n\'^\' for Power\n\'&\' for Square Root\n> ");
        char ch = scanner.next().charAt(0);
        
        Calculator calculator = new Calculator(op1, op2, ch);
    }
}
