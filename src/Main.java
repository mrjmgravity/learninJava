import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pozdrav = "Ahoj moje meno je: ";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno: ");
        String meno = myScanner.nextLine();
        System.out.println( pozdrav + meno);


        for(int i = 0; i<10; i++){
            System.out.println(i*5);

        }
        String[] mena = new String[] {"Jan", "Peter", "Katka","Jana"};

        for(String jmeno: mena ) {
            System.out.println(jmeno);

        }

        }

    }


