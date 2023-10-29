package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        double var6 = (Math.sqrt(var1) + var2)/var3;
        boolean resultado1;
        resultado1 = var6 == var2;
        //Comparamos las dos cantidades y obtenemos un valor de verdad.
        boolean resultado2;
        resultado2 = var4 >= var5;
        //Comparamos las dos cantidades y obtenemos otro valor de verdad.
        boolean resultadoFinal;
        resultadoFinal = resultado1 && resultado2;
        //Operamos los dos booleanos con el conector logico AND y obtenemos el resultado final.
        System.out.println("La operacion da como resultado: " + resultadoFinal);
        
    }
}