import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        System.out.println("Ten program przelicza stopnie Celsjusza na stopnie Fahrenheita.");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");

        double stala_2 = 32;
        double number = userInput.nextDouble();

        double wynik = (1.8 * number) + 32;

        System.out.println("Podane stopnie w Fahrenheitach: " + wynik);
    }
}
