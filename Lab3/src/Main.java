import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1
        sredniaPunktow();
        // 2
        sumaDodatnichUjemnych();
        // 3
        ciagAn();
        // 4
        ciagLosowy();
//         5
        System.out.println("Podaj słowo: ");
        String slowo = inputString();
        if (palindrom(slowo) == true) {
            System.out.println("Podane słowo jest palindromem");
        } else {
            System.out.println("Podane słowo nie jest palindromem");
        }

    }

    public static boolean palindrom(String slowo){
        int a = 0, b = slowo.length() -1;
        while (a < b) {
            if (slowo.charAt(a) != slowo.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static void ciagLosowy(){
        int sumaParzystych = 0;
        System.out.println("Podaj długość ciągu: ");
        int n = inputInt();
        int[] ciag = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            ciag[i] = random.nextInt(-10, 45);
            System.out.println((i+1) + " wyraz ciągu wynosi: " + ciag[i]);
        }
        for(int j = 0; j < n; j++){
            if((ciag[j] % 2) == 0){
                sumaParzystych = sumaParzystych + ciag[j];
            }
        }
        System.out.println("Suma parzystych wyrazów ciągu wynosi: " + sumaParzystych);

    }

    public static void ciagAn(){
        int sumaParzystych = 0;
        System.out.println("Podaj długość ciągu: ");
        int n = inputInt();
        int[] ciag = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Podaj " + (i + 1) + " wyraz ciągu: ");
            ciag[i] = inputInt();
        }
        for(int j = 0; j < n; j++){
            if((ciag[j] % 2) == 0){
                sumaParzystych = sumaParzystych + ciag[j];
            }
        }
        System.out.println("Suma parzystych wyrazów ciągu wynosi: " + sumaParzystych);

    }

    public static void sumaDodatnichUjemnych(){
        int[] tab = new int[10];
        int sumaDodatnich = 0, sumaUjemnych = 0, iloscDodatnich = 0, iloscUjemnych = 0, iloscZer = 0;
        System.out.println("Podaj 10 liczb: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Podaj " + (i+1) + " liczbę: ");
            tab[i] = inputInt();
        }
        for(int j = 0; j < 10; j++){
            if (tab[j] > 0) {
                sumaDodatnich = sumaDodatnich + tab[j];
                iloscDodatnich ++;
            } else if (tab[j] < 0) {
                sumaUjemnych = sumaUjemnych + tab[j];
                iloscUjemnych ++;
            } else {
                iloscZer ++;
            }
        }
        System.out.println("Suma liczb dodatnich wynosi: " + sumaDodatnich + "\n" + "Ilość liczb dodatnich wynosi: " + iloscDodatnich + "\n" +
                "Suma licz ujemnych wynosi: " + sumaUjemnych + "\n" + "Ilość liczb ujemnych wynosi: " + iloscUjemnych + "\n" +
                "Ilość zer wynosi: " + iloscZer);
    }

    public static void sredniaPunktow(){
        System.out.println("Podaj liczbę studentów: ");
        int s = inputInt(), n = 1;
        double srednia = 0;
        while (n <= s) {
            System.out.println("Podaj liczbę punktów " + n + " studenta: ");
            int pkt = inputInt();
            srednia = srednia + pkt;
            n ++;
        }
        srednia = srednia / s;
        System.out.println("Średnia liczba punktów " + s + " stódentów wynosi: " + srednia);
    }

    public static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String znaki = scanner.nextLine();
        return znaki;
    }
}
