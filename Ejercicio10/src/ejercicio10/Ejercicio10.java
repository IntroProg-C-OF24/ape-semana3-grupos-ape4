package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        double var6 = (Math.sqrt(var1) * var2);
        double var7 = (var2 / var4);
        boolean resultado1 = var6 >= var3;
        //Comparamos las dos cantidades y obtenemos un valor de verdad.
        boolean resultado2 = var7 >= var5;
        //Comparamos las dos cantidades y obtenemos otro valor de verdad.
        boolean resultadoFinal = resultado1 && true || false || resultado2;
        //Operamos los booleanos con los conectores logicos y obtenemos el resultado final.
        System.out.println("La operacion da como resultado: " + resultadoFinal);
    }
}
