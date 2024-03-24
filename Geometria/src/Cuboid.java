public class Cuboid {
    private  double a = 2;
    private  double b = 3;
    private  double c = 5;
    private String name = "Prostopadłościan";

    public double pole(double a, double b, double c){
        return a * b * 2 + a * c * 2 + c * b * 2;
    }
    public double objetosc(double a, double b, double c){
        return a * b * c;
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Długość boków: " + a + ", " + b + ", " + c +
                "\n Pole prostopadłościanu: " + pole(a, b, c) +
                "\n Objętość prostopadłościanu: " + objetosc(a, b, c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String getName() {
        return name;
    }
}