import java.util.Arrays;
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
        // Zadanie 3
        sortowanieTablicy();
        // Zadanie 4
        trasaNaUczelnie();
        // Zadanie 5
        czyMoznaKupicSamochod();
        // Zadanie 6
        kalkulator();
    }

    public static void czyMoznaKupicSamochod() {
        System.out.println("Czy jest zniżka na samochód (jest / nie ma): ");
        String znizka = inputString();
        System.out.println("Czy dostałeś premie? (tak dostałem / nie dosatałem): ");
        String premia = inputString();
        String znizkaJest = "jest", znizkaNieMa = "nie ma", premiaTak = "tak dostałem", premiaNie = "nie dostałem";
        if (znizka.equals(znizkaJest) || premia.equals(premiaTak)) {
            System.out.println("Możesz kupić samochód!");
        } else if (znizka.equals(znizkaNieMa) && premia.equals(premiaTak)) {
            System.out.println("Zniżki nie ma ale samochód możesz kupić");
        } else if (znizka.equals(znizkaNieMa) || premia.equals(premiaNie)){
            System.out.println("Niestety... zakup samochodu trzeba odłożyć na później...");
        }
    }

    public static void kalkulator(){
        System.out.println("Podaj dwie liczby: ");
        double a = inputDouble(), b = inputDouble(), wynik = 0;
        System.out.println("Jakie działanie chcesz wykonać: \n(dodawanie(+), odejmowanie(-), iloraz(*), iloczyn(/), reszta z dzielenia(%)) ");
        String dzialanie = inputString();
        switch (dzialanie) {
            case "dodawanie":
                wynik = a + b;
                System.out.println("Wynik działania (a + b) to: " + wynik);
                break;
            case "+":
                wynik = a + b;
                System.out.println("Wynik działania (a + b) to: " + wynik);
                break;
            case "odejmowanie":
                wynik = a - b;
                System.out.println("Wynik działania (a - b) to: " + wynik);
                break;
            case "-":
                wynik = a - b;
                System.out.println("Wynik działania (a - b) to: " + wynik);
                break;
            case "iloraz":
                wynik = a * b;
                System.out.println("Wynik działania (a * b) to: " + wynik);
                break;
            case "*":
                wynik = a * b;
                System.out.println("Wynik działania (a * b) to: " + wynik);
                break;
            case "iloczyn":
                wynik = a / b;
                System.out.println("Wynik działania (a / b) to: " + wynik);
                break;
            case "/":
                wynik = a / b;
                System.out.println("Wynik działania (a / b) to: " + wynik);
                break;
            case "reszta z dzielenia":
                wynik = a % b;
                System.out.println("Wynik działania (a % b) to: " + wynik);
                break;
            case "%":
                wynik = a % b;
                System.out.println("Wynik działania (a % b) to: " + wynik);
                break;
            default:
                break;
        }
    }

    public static void trasaNaUczelnie(){
        System.out.println("Jaka jest pogoda ('pada' / 'nie pada'): ");
        String pogoda = inputString();
        System.out.println("Czy jest autobus (jest autobus / nie ma autobusu): ");
        String autobus = inputString();
        String pogodaPada = "pada", pogodaNiePada = "nie pada", autobusJest = "jest autobus";
        if (pogoda.equals(pogodaPada) && autobus.equals(autobusJest)) {
            System.out.println("Weź parasol, dostaniesz się na uczelnie");
        } else if (pogoda.equals(pogodaNiePada) && autobus.equals(autobusJest)) {
            System.out.println("Dostaniesz się na uczelnie, miłego dnia i pięknej pogody");
        } else {
            System.out.println("Nie dostaniesz się na uczelnie");
        }
    }

    public static void sortowanieTablicy(){
        System.out.println("Podaj wielkość tablicy: ");
        int x = inputInt();
        int[] tab = new int[x];

        for (int i = 0; i < tab.length; i ++){
            System.out.println("Podaj " + (i+1) + " liczbę: ");
            tab[i] = inputInt();
        }

        System.out.println("Twoje liczby to: " + tab[0] + ", " + tab[1] + ", " + tab[2]);
        Arrays.sort(tab);

        System.out.println("Posortowane liczby to: ");
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }

    public static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String znaki = scanner.nextLine();
        return znaki;
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