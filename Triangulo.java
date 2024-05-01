public class Triangulo{
    String color;
    double base;
    double altura;

    public Triangulo(String color, double base, double altura){
        this.color = color;
        this.base = base;
        this.altura = altura;
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
        return (base*altura)/2;
    }

    private double perimetro(){
        return Math.sqrt((Math.pow(altura,2))+(Math.pow(base,2)));
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Rosa", 10.0,5.0);
        System.out.println("Color del triángulo: " + triangulo.getColor());
        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
    }

}