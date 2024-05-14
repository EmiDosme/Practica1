public class Punto2 {
    public static void main(String[] args) {
        
        Punto3D[] puntos = new Punto3D[10];
        puntos[0] = new Punto3D(1, 2, 3);
        puntos[1] = new Punto3D(4, 5, 6);
        puntos[2] = new Punto3D(7, 8, 9);
        puntos[3] = new Punto3D(10, 20, 30);
        puntos[4] = new Punto3D(13, 14, 15);
        puntos[5] = new Punto3D(16, 17, 18);
        puntos[6] = new Punto3D(19, 20, 21);
        puntos[7] = new Punto3D(22, 23, 24);
        puntos[8] = new Punto3D(25, 26, 27);
        puntos[9] = new Punto3D(28, 29, 30);
        
        
        double menorDistancia = Double.MAX_VALUE;
        Punto3D punto1 = null;
        Punto3D punto2 = null;
        
        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                double distancia = puntos[i].distancia(puntos[j]);
                System.out.println("Distancia entre puntos " + i + " y " + j + ": " + distancia);
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                    punto1 = puntos[i];
                    punto2 = puntos[j];
                }
            }
        }
        
       
        System.out.println("La menor distancia es entre los puntos: ");
        System.out.println("Punto 1: (" + punto1.getX() + ", " + punto1.getY() + ", " + punto1.getZ() + ")");
        System.out.println("Punto 2: (" + punto2.getX() + ", " + punto2.getY() + ", " + punto2.getZ() + ")");
        System.out.println("Distancia: " + menorDistancia);
    }
}
