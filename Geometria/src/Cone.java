public class Cone {
    private double r = 3;
    private double h = 2;
    private String name = "Stożek";

    public double pole(double r, double h){
        return Math.PI * r * (r + (Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2))));
    }
    public double objetosc(double r, double h){
        double a = (double) 1 / 3;
        return a * Math.PI * Math.pow(r, 2) * h;
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Pole stożka: " + pole(r, h) +
                "\n Objętość stożka: " + objetosc(r, h));
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public String getName() {
        return name;
    }
}
