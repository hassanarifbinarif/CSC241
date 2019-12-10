import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a1.txt");
        PrintWriter pw = new PrintWriter(file);
        

        ArrayList<String> files = new ArrayList<String>(4);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter input 3 : ");

        for (int i = 0; i < 4; i++) {

            files.add(scan.next());
            String s = files.get(i);
            String s1 = "\n";
            pw.write(s);
            pw.write(s1);
        }
        pw.close();

        Scanner reader = new Scanner(new File("a1.txt"));
        while (reader.hasNextLine()){
            String Line = reader.nextLine();
            System.out.println(Line);
        }
        reader.close();
    }
}
