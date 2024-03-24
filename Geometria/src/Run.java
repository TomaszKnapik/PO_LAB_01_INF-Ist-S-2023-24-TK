import java.awt.*;
import java.util.Scanner;

public class Run {
    public void Running(){
        int wybor;
        while(true){
            Menu();
            wybor = inputInt();

            switch (wybor){
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 ->  viewCube();
                case 5 ->  viewCuboid();
                case 6 ->  viewSphere();
                case 7 ->  viewCone();
                default -> defaultInstruction();
            }
        }
    }

    private void viewCone(){
        Cone stozek = new Cone();
        System.out.println("Podaj promień stożka: ");
        double r = inputDouble();
        System.out.println("Podaj wysokość stożka: ");
        double h = inputDouble();
        if (r > 0 && h > 0){
            stozek.setR(r);
            stozek.setH(h);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. r = " + Math.abs(r));
            stozek.setR(Math.abs(r));
            stozek.setH(Math.abs(h));
        }
        stozek.view();
    }
    private void viewCircle() {
        Circle kolo = new Circle();
        System.out.println("Podaj promień: ");
        double r = inputDouble();
        if (r > 0){
            kolo.setR(r);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. r = " + Math.abs(r));
            kolo.setR(Math.abs(r));
        }
        kolo.view();
    }

    private void viewSquare() {
        Square kwadrat = new Square();
        System.out.println("Podaj bok kwadratu: ");
        double a = inputDouble();
        if (a > 0){
            kwadrat.setA(a);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            kwadrat.setA(Math.abs(a));
        }
        kwadrat.view();
    }

    private void viewRectangle() {
        Rectangle prostokat = new Rectangle();
        System.out.println("Podaj boki Prostokąta: ");
        System.out.println("bok a: ");
        double a = inputDouble();
        System.out.println("bok b: ");
        double b = inputDouble();
        if (a > 0 && b > 0){
            prostokat.setA(a);
            prostokat.setB(b);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a) + " b = " + Math.abs(b));
            prostokat.setA(Math.abs(a));
            prostokat.setB(Math.abs(b));
        }
        prostokat.view();
    }

    private void viewCube() {
        Cube szescian = new Cube();
        System.out.println("Podaj bok sześcianu: ");
        double a = inputDouble();
        if (a > 0){
            szescian.setA(a);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a));
            szescian.setA(Math.abs(a));
        }
        szescian.view();
    }

    private void viewCuboid() {
        Cuboid prostopadloscian = new Cuboid();
        System.out.println("Podaj boki Prostopadłościanu: ");
        System.out.println("a: ");
        double a = inputDouble();
        System.out.println("b: ");
        double b = inputDouble();
        System.out.println("c: ");
        double c = inputDouble();
        if (a > 0 && b > 0 && c > 0){
            prostopadloscian.setA(a);
            prostopadloscian.setB(b);
            prostopadloscian.setC(c);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. a = " + Math.abs(a) + " b = " + Math.abs(b));
            prostopadloscian.setA(Math.abs(a));
            prostopadloscian.setB(Math.abs(b));
            prostopadloscian.setC(Math.abs(c));
        }
        prostopadloscian.view();
    }

    private void viewSphere() {
        Sphere kula = new Sphere();
        System.out.println("Podaj promień kuli: ");
        double r = inputDouble();
        if (r > 0){
            kula.setR(r);
        } else {
            System.out.println("Podano liczbe ujemną, zmieniam ją na liczbę dodatnią. r = " + Math.abs(r));
            kula.setR(Math.abs(r));
        }
        kula.view();
    }

    private void defaultInstruction() {

    }

    public int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }

    public void Menu(){
        System.out.println("Menu programu: \n (1. Koło)\n (2. Kwadrat)\n (3. Prostokąt)\n (4. Sześcian)\n (5. Prostopadłościan)\n (6. Kula)\n (7. Stożek)");
    }

}