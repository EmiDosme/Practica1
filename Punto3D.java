import java.lang.Math;

public class Punto3D {
    private double x;
    private double y;
    private double z;
    
    // Constructor por defecto
    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    // Constructor con parámetros
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // Constructor que recibe un objeto Punto3D
    public Punto3D(Punto3D punto) {
        this.x = punto.getX();
        this.y = punto.getY();
        this.z = punto.getZ();
    }
    
    // Métodos set y get para x
    public void setX(double x) {
        this.x = x;
    }
    
    public double getX() {
        return this.x;
    }
    
    // Métodos set y get para y
    public void setY(double y) {
        this.y = y;
    }
    
    public double getY() {
        return this.y;
    }
    
    // Métodos set y get para z
    public void setZ(double z) {
        this.z = z;
    }
    
    public double getZ() {
        return this.z;
    }
    
    // Método para calcular la distancia euclidiana entre dos puntos
    public double distancia(Punto3D otroPunto) {
        double distanciaX = this.x - otroPunto.getX();
        double distanciaY = this.y - otroPunto.getY();
        double distanciaZ = this.z - otroPunto.getZ();
        
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY + distanciaZ * distanciaZ);
    }
    
    public static void main(String[] args) {
        Punto3D punto1 = new Punto3D(1, 2, 3);
        Punto3D punto2 = new Punto3D(4, 5, 6);
        
        System.out.println("Distancia entre los puntos: " + punto1.distancia(punto2));
    }
}
