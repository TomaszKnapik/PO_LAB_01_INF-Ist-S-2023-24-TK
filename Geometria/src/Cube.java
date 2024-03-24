public class Cube {
    private double a = 2;
    private String name = "Sześcian";

    public  double pole(double a){
        return Math.pow(a, 2) * 6;
    }

    public  double objetosc(double a){
        return Math.pow(a, 3);
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Długość boku: " + a +
                "\n Pole sześcianu: " + pole(a) +
                "\n Objętość sześcianu: " + objetosc(a));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }
}