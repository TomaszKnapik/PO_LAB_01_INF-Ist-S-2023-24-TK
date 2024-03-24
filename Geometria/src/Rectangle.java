public class Rectangle {
    private  double a = 2;
    private  double b = 3;
    private String name = "Prostokąt";

    public double pole(double a, double b){
        return a * b;
    }
    public double obwod(double a, double b){
        return 2 * a + 2 * b;
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Długość boków prostokąta: " + a + ", " + b +
                "\n Pole prostokąta: " + pole(a, b) +
                "\n Obwód prostokąta: " + obwod(a, b));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
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

    public String getName() {
        return name;
    }
}