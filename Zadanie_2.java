//import java.util.Scanner;
//
//public class Zadanie_2 {
//    public static void main(String[] args) {
//        System.out.println("Ten program wybiera najwieksza sposrod podanych liczb.");
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Podaj pierwsza liczbe: ");
//        double number1 = userInput.nextDouble();
//        System.out.print("Podaj druga liczbe: ");
//        double number2 = userInput.nextDouble();
//        System.out.print("Podaj trzecia liczbe: ");
//        double number3 = userInput.nextDouble();
//
//        if (number1 > number2 && number1 > number3) {
//            if (number2 < number3 && number2 < number1) {
//                System.out.println("Najwyzsza liczba jest: " + number1);
//                System.out.println("Najmniejsza liczba jest: " + number2);
//            } else {
//                System.out.println("Najwyzsza liczba jest: " + number1);
//                System.out.println("Najmniejsza liczba jest: " + number3);
//            }
//        } else if (number2 > number1 && number2 > number1) {
//            if (number1 < number3 && number1 < number1) {
//                System.out.println("Najwyzsza liczba jest: " + number2);
//                System.out.println("Najmniejsza liczba jest: " + number1);
//            } else {
//                System.out.println("Najwyzsza liczba jest: " + number2);
//                System.out.println("Najmniejsza liczba jest: " + number3);
//            }
//        } else {
//            System.out.println("Najwyzsza liczba jest: " + number3);
//            if (number1 < number3 && number1 < number1) {
//                System.out.println("Najwyzsza liczba jest: " + number3);
//                System.out.println("Najmniejsza liczba jest: " + number1);
//            } else {
//                System.out.println("Najwyzsza liczba jest: " + number3);
//                System.out.println("Najmniejsza liczba jest: " + number2);
//            }
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Zadanie_2 {
//    public static void main(String[] args) {
//        System.out.println("Ten program wybiera najwieksza sposrod podanych liczb.");
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Podaj pierwsza liczbe: ");
//        int a = userInput.nextInt();
//        System.out.print("Podaj druga liczbe: ");
//        int b = userInput.nextInt();
//        System.out.print("Podaj trzecia liczbe: ");
//        int c = userInput.nextInt();
//
//        int max;
//        int min;
//
//        if (a > b && a > c) {
//            max = a;
//        } else if (b > a && b > c) {
//            max = b;
//        } else {
//            max = c;
//        }
//        if (a < b && a < c) {
//            min = a;
//        } else if (b < a && b < c) {
//            min = b;
//        } else {
//            min = c;
//        }
//
//        System.out.println("Najwieksza liczba to: " + max);
//        System.out.println("Najmniejsza liczba to: " + min);
//    }
//}
//
//import java.util.Scanner;
//
//public class Zadanie_2 {
//    public static void main(String[] args) {
//        System.out.println("Ten program wybiera najwieksza sposrod podanych liczb.");
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Podaj pierwsza liczbe: ");
//        int a = userInput.nextInt();
//        System.out.print("Podaj druga liczbe: ");
//        int b = userInput.nextInt();
//        System.out.print("Podaj trzecia liczbe: ");
//        int c = userInput.nextInt();
//
//        int max = Math.max(Math.max(a, b), c);
//        int min = Math.min(Math.min(a, b), c);
//
//
//        System.out.println("Najwieksza liczba to: " + max);
//        System.out.println("Najmniejsza liczba to: " + min);
//    }
//}