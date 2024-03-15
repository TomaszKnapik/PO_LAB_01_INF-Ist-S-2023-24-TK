import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Zadanie 1
        System.out.println("Zadanie 1. podaj 3 liczby: ");
        int a = inputInt();
        int b = inputInt();
        int c = inputInt();
        System.out.println("Twoje równanie kwadratowe to: " + a + "x^2 + " + b + "x + " + c);
        fKwadratowa(a, b, c);
//        Zadanie 2
        System.out.println("Zadanie 2. podaj 3 liczby: ");
        System.out.println("a(x): ");
        int ax = inputInt();
        funkcjaAx(ax);
        System.out.println("b(x): ");
        int bx = inputInt();
        funkcjaBx(bx);
        System.out.println("c(x): ");
        int cx = inputInt();
        funkcjaCx(cx);
    }

    public static void funkcjaAx(int a){
        double wynik;
        if (a > 0){
            wynik = a * 2;
            System.out.println("a(x) = " + wynik);
        } else if (a == 0) {
            wynik = 0;
            System.out.println("a(x) = " + wynik);
        } else {
            wynik = -3 * a;
            System.out.println("a(x) = " + wynik);
        }
    }
    public static void funkcjaBx(int b){
        double wynik;
        if (b >= 1){
            wynik = Math.pow(b, 2);
            System.out.println("b(x) = " + wynik);
        } else {
            System.out.println("b(x) = " + b);
        }
    }
    public static void funkcjaCx(int c){
        double wynik;
        if (c > 2){
            wynik = c + 2;
            System.out.println("c(x) = " + wynik);
        } else if (c == 2) {
            wynik = 8;
            System.out.println("c(x) = " + wynik);
        } else {
            wynik = c - 4;
            System.out.println("c(x) = " + wynik);
        }
    }


    // Scaner liczby typu int
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // Obliczanie miejsc zerowych funkcji kwadratowej dla parametrów a, b, c
    public static void fKwadratowa(int a, int b, int c){
        double d, x1, x2;
        d =  Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (d > 0){
            x1 = (-b-d)/(2*a);
            x2 = (-b+d)/(2*a);
            System.out.println("Funkcja ma dwa miejsca zerowe: \nx1: " + x1 + "\nx2: " + x2);
        } else if (d == 0) {
            x1 = (-b)/(2*a);
            System.out.println("Funkcja ma jedno miejsce zerowe: " + x1);
        } else {
            System.out.println("Funkcja nie ma miejsc zerowych");
        }
    }
}