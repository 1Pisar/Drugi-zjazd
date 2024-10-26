import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbe ");
        int number = userInput.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i == number) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
