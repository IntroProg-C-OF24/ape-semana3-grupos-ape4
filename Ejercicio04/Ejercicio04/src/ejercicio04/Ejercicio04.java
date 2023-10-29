package ejercicio04;
public class Ejercicio04 {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 1;
        int var3 = 3;
        int var4 = 2;
        double resultado1 = (var1/(var2 + var3))+ var4;
        boolean resultadofinal = resultado1 >= var3;
        //Hacemos la comparacion de las dos cantidades con un operador relacional y obtenemos como resultado un booleano.
        System.out.println(resultadofinal);
    }
}
