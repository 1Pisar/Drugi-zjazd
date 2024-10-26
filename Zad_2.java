import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbe ");
        int number = userInput.nextInt();

        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j == number) {
                    System.out.print(j);
                } else {
                    System.out.print(j + ", ");
                }
            }
        }
    }
}