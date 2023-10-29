package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        double var10 = ((var1 * var2) + var3 - (var4 / var5) + Math.pow(var6, 2));
        double var11 = (var8 - var8 + var9);
        boolean resultado1 = var10 >= var7;
        //Comparamos las dos cantidades y obtenemos un valor de verdad.
        boolean resultado2 = var8 >= var11;
        //Comparamos las dos cantidades y obtenemos otro valor de verdad.
        boolean resultadoFinal = resultado1 || resultado2;
        //Operamos los dos booleanos con el conector logico OR y obtenemos el resultado final.
        System.out.println("La operacion da como resultado: " + resultadoFinal);
    }
}
