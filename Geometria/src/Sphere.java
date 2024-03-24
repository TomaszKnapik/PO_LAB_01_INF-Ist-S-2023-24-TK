public class Sphere {
    private double r = 3;
    private String name = "Kula";

    public double pole(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }
    public double objetosc(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Promnień: " + r +
                "\n Pole kuli: " + pole(r) +
                "\n Objętość kuli: " + objetosc(r));
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public String getName() {
        return name;
    }
}