import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        //  1
        System.out.println(imieWiek());

        //  2
        System.out.println("Podaj dwie liczby:");
        int a = inputInt();
        int b = inputInt();
        System.out.println("Suma liczb: " + (a+b));
        System.out.println("Różnica liczb: " + (a-b));
        System.out.println("Iloczyn liczb: " + (a*b));

        //  3
        System.out.println("Podaj liczbę (czy liczba jest parzysta): ");
        int c = inputInt();
        System.out.println(czyParzysta(c));

        //  4
        System.out.println("Podaj liczbę (czy liczba jest podzielna przez 3 i 5): ");
        int d = inputInt();
        System.out.println(czyPodzielna(d));

        //  5
        System.out.println("Podaj liczbę (liczba ^3): ");
        double e = inputInt();
        System.out.println(potega3(e));

        //  6
        System.out.println("Podaj liczbę (pierwiastek kwadratowy): ");
        double f = inputInt();
        System.out.println(pierwiastek(f));

        //  7
        double g = liczbyLosowe();
        double h = liczbyLosowe();
        double i = liczbyLosowe();
        System.out.println("Twoje losowe liczby to: " + g + ", " + h + ", " + i);
        System.out.println(trojkatProstokatny(g, h, i));
    }

    public static String imieWiek(){
        String imie = "Tomasz";
        int wiek = 20;
        return "Imie: " + imie + ", wiek: " + wiek;
    }

    //Scaner liczb typu int
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean czyParzysta(int a){
        return a % 2 == 0;
    }
    public static boolean czyPodzielna(int a){
        return a % 3 == 0 && a % 5 ==0;
    }
    public static double potega3(double a){
        return Math.pow(a, 3);
    }
    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }
    public static int liczbyLosowe(){
        return rnd.nextInt(2, 10);
    }
    public static boolean trojkatProstokatny(double a, double b, double c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
            || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
            || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }
}