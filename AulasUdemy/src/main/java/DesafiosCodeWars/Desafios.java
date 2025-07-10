package DesafiosCodeWars;

public class Desafios {
    public static void main(String[] args) {

    }

    //Complete a função de soma quadrada para que ela eleve ao quadrado cada número passado a ela e então some os resultados.
    public int SquareSum(int[] arr) {
        int resultado = 0;
        for (int i = 0; i < arr.length; i++) {
            resultado += arr[i] * arr[i];
        }
        return resultado;
    }
}

