package desafioConversao;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores dos salarios: ");

        String valor1 = sc.nextLine().replace(",",".");
        String valor2 = sc.nextLine().replace(",",".");
        String valor3 = sc.nextLine().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double soma = salario1 + salario2 + salario3;

        System.out.println("Soma dos Salarios: " + soma);

        sc.close();





    }
}
