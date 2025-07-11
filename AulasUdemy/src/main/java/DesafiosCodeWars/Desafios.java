package DesafiosCodeWars;

public class Desafios {
    public static void main(String[] args) {

    }

    //Complete a função de soma quadrada para que ela eleve ao quadrado cada número
    // passado a ela e então some os resultados.
    public int SquareSum(int[] arr) {
        int resultado = 0;
        for (int i = 0; i < arr.length; i++) {
            resultado += arr[i] * arr[i];
        }
        return resultado;
    }
    //Se uma das flores tiver um número par de pétalas e a outra um número ímpar, significa que estão apaixonados.
    //Escreva uma função que receberá o número de pétalas de cada flor e retornará true se elas
    // estiverem apaixonadas e false se não estiverem.
    public static boolean isLove(final int flower1, final int flower2) {
        boolean resultado;
        if ((flower1 + flower2) % 2 == 0) {
            return resultado = false;
        } else
            return resultado = true;
    }
}

