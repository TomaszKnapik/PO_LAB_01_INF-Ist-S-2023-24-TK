public class Circle {
    private double r = 3;
    private String name = "Koło";

    public double pole(double r){
        return Math.PI * Math.pow(r, 2);
    }
    public double obwod(double r){
        return 2 * Math.PI * r;
    }

    public void view(){
        System.out.println("Figura: " + name +
                "\n Promnień: " + r +
                "\n Pole koła: " + pole(r) +
                "\n Obwód koła: " + obwod(r));
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