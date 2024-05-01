public class Rectangulo{
    private String color;
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura){
        this.color = color;
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return area();
    }

    public double getPerimetro(){
        return perimetro();
    }

    public String getColor(){
        return color;
    }

    private double area(){
        return base * altura;
    }

    private double perimetro(){
        return 2 * (base + altura);
    }

    
        
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("azul", 10.0, 5.0);
        System.out.println("Color del rectángulo: " + rectangulo.getColor());
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());
        }



}