import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbe ");

        try {
            int number = userInput.nextInt();

            if (number < 1) {
                System.out.println("Podana liczba powinna byc wieksza od 0 ");
            } else
            for (int i = 1; i <= number; i++) {}
        } catch (InputMismatchException exception) {
            System.out.println("Prosze podac liczbe calkowita ");
        }
    }
}