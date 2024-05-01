public class Rombo{
    String color;
    double diagonalmenor;
    double diagonalmayor;
    double lado;

    public Rombo(String color, double diagonalmayor, double diagonalmenor, double lado){
        this.color = color;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
        this.lado = lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    public String getColor() {
        return color;
    }

    private double area(){
        return (diagonalmayor*diagonalmenor)/2;
    }

    private double perimetro(){
        return lado*4;
    }

    public static void main(String[] args) {
        Rombo rombo = new Rombo("Verde", 8.0,4.0,5.0);
        System.out.println("Color del rombo: " + rombo.getColor());
        System.out.println("Área del rombo: " +  rombo.getArea());
        System.out.println("Perímetro del rombo: " + rombo.getPerimetro());
    }
}