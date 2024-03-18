import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1
         sumaSredniaTablicy();
        // 2
         tablicaParzystaNieparzysta();
        // 3
         duzeLitery();
        // 4
         piecSlow();
        // 5
         sortowanieTablicy();
        // 6
         silnia();
        // 7
         dwieTabliceString();
    }

    public static void dwieTabliceString() {
        String[] st1 = {"Ala", "ma", "kota"};
        String[] st2 = {"Ala", "ma", "kota"};
        int wynik = 0;
        for(int i = 0; i < st1.length; i++){
            if (st1[i] == st2[i]) {
                wynik ++;
            }
        }
        if (wynik == st1.length) {
            System.out.println("Dwie tablice są identyczne");
        } else {
            System.out.println("Dwie tablice nie są identyczne");
        }
    }

    public static void silnia(){
        int[] tab = new int[5];
        System.out.println("Podaj 5 liczb: ");
        for(int h = 0;  h < tab.length; h++){
            tab[h] = inputInt();
        }
        System.out.println(tab.length);
        for(int i = 0; i <  tab.length;i++) {
            int silnia = tab[i];
            int wynik = 1;
            for(int j = silnia; j > 0; j--){
                wynik = wynik * j;
                System.out.println(silnia + ": " + wynik);
            }
        }
    }

    public static void sortowanieTablicy(){
        int[] tab = new int[8];
        System.out.println("Podaj 8 liczb: ");
        for(int h = 0; h <  tab.length; h++){
            tab[h] = inputInt();
        }
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j+1]) {
                    int wartosc = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = wartosc;
                }
            }
        }
        for (int g = 0; g < tab.length; g++){
            System.out.println((g + 1) + " element tablicy: " + tab[g]);
        }
    }

    public static void piecSlow(){
        System.out.println("Podaj 5 słów: ");
        String[] tab = new String[5];
        for(int i = 0; i < tab.length; i++){
            System.out.println("Podaj " + (i+1) + " słowo: ");
            tab[i] = inputString();
        }
        for (int h = tab.length - 1; h >= 0; h--) {
            String slowa = tab[h];
            char[] litery = slowa.toCharArray();
            for (int j = litery.length - 1; j >= 0; j--) {
                System.out.print(litery[j]);
            }
            System.out.println();
        }
    }

    public static void duzeLitery(){
        String[] tab = {"majonez", "kukurydza", "groszek"};
        for (String lista : tab) {
            lista = lista.toUpperCase();
            System.out.println(lista);
        }
    }

    public static void tablicaParzystaNieparzysta(){
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {1,2,3,4,5,6,7};
        for (int i = 0; i < a.length; i += 2){
            System.out.println(a[i]);
        }
        for (int j = 0; j < b.length; j += 2){
            System.out.println(b[j]);
        }
    }

    public static void sumaSredniaTablicy(){
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = inputRandom();
        }
        int suma = 0, srednia = 0;
        for(int i = 0; i < a.length; i++){
            suma = suma + a[i];
        }
        srednia = suma/a.length;
        System.out.println("Suma liczb elementów tablicy losowej: " + suma);
        System.out.println("Średnia liczb elementów tablicy losowej: " + srednia);
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String znaki = scanner.nextLine();
        return znaki;
    }

    public static int inputRandom(){
        Random random = new Random();
        int liczba = random.nextInt(0, 100);
        return liczba;
    }
}