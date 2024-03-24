public class Square {
    private double a = 2;
    private String name = "Kwadrat";

    public  double pole(double a){
        return Math.pow(a, 2);
    }

    public  double obwod(double a){
        return 4 * a;
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Długość boku: " + a +
                "\n Pole kwadratu: " + pole(a) +
                "\n Obwód kwadratu: " + obwod(a));
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