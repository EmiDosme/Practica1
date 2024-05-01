public class Trapecio{
    String color;
    double altura;
    double Base;
    double base;
    double lado;

    public Trapecio(String color, double altura, double Base, double base, double lado){
        this.color = color;
        this.altura = altura;
        this.Base = Base;
        this.base = base;
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
        return ((Base+base)/2)*altura;
    }

    private double perimetro(){
        return Base+base+(lado*2);
    }

    public static void main(String[] args) {
        Trapecio trapecio = new Trapecio("Blanco", 4.0,8.0,6.0,5.0);
        System.out.println("Color del trapecio: " + trapecio.getColor());
        System.out.println("Área del trapecio: " +  trapecio.getArea());
        System.out.println("Perímetro del trapecio: " + trapecio.getPerimetro());
    }
}