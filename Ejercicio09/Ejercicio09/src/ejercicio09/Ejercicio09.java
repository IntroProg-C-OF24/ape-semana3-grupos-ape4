package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 25;
        int var3 = 10;
        int var4 = 50;
        double var5 = (Math.sqrt(var1) + (Math.sqrt(var2) * var3));
        boolean respuesta;
        respuesta = var5 >= var4;
        System.out.println("La operacion da como resultado: " + respuesta);
    }   
}
