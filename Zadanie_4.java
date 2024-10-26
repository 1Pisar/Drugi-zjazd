import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        System.out.println("Kalkulator");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Podaj pierwsza liczbe: ");
        double a = userInput.nextInt();
        System.out.print("Podaj dzialanie (+, -, *, /): ");
        String sign = userInput.next();
        System.out.print("Podaj druga liczbe: ");
        double b = userInput.nextInt();

        double wynik;

        switch(sign) {
            case "+":
                wynik = a + b;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case "-":
                wynik = a - b;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case "*":
                wynik = a * b;
                System.out.println("Wynik mnozenia: " + wynik);
                break;
            case "/":
                if (b==0){
                    System.out.println("b jest 0");
                } else {
                    wynik = a / b;
                    System.out.println("Wynik dzielenia: " + wynik);
                }
                break;
            default:
                System.out.println("Podano bledna operacje");
        }
    }
}