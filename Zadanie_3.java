import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        System.out.println("Ten program wybiera najwieksza sposrod podanych liczb.");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Podaj kwote z przedzialu od 100zl do 10tys zl: ");
        double kwota = userInput.nextDouble();
        System.out.print("Podaj liczbe rat od 6 do 48: ");
        int rata = userInput.nextInt();

        double miesiecza_rata = 0;

        if (rata >= 6 && rata <= 12) {
            miesiecza_rata = Math.round((kwota/rata) * 1.025);
            System.out.println("Rata wynosi: " + miesiecza_rata);
        } else if (rata <= 24) {
            miesiecza_rata = Math.round((kwota/rata) * 1.05);
            System.out.println("Rata wynosi: " + miesiecza_rata);
        } else if (rata <= 48) {
            miesiecza_rata = Math.round((kwota/rata) * 1.1);
            System.out.println("Rata wynosi: " + miesiecza_rata);
        }
    }
}