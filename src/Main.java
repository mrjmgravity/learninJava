import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pozdrav = "Ahoj moje meno je: ";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno: ");
        String meno = myScanner.nextLine();
        System.out.println( pozdrav + meno);

    }
}

