import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankAccount acc = new BankAccount("nmanumr");
    acc.printBalance();

    System.out.print("Enter amount to deposite: ");
    acc.deposit(scanner.nextInt());

    acc.printBalance();
    System.out.print("Enter amount to withdraw: ");
    acc.withdraw(scanner.nextInt());

    acc.printBalance();
    scanner.close();
  }
}

class BankAccount{
  String title;
  Integer balance;

  public BankAccount(String title){
    this.title = title;
    this.balance = 500;
  }

  public BankAccount(String title, Integer balance){
    this.title = title;
    this.balance = balance;
  }

  public void printBalance(){
    System.out.println(this.balance);
  }

  public void deposit(Integer amount){
    this.balance += amount;
    System.out.printf("Deposited %d in %s's account\n", this.balance, this.title);
  }

  public void withdraw(Integer amount){
    this.balance -= amount;
    System.out.printf("Withdrawn %d in %s's account\n", this.balance, this.title);
  }
}
