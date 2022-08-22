package desafioConversao;

import java.util.Scanner;

public class DiasdaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int domingo = 1;
        int segunda = 2;
        int terca = 3;
        int quarta = 4;
        int quinta = 5;
        int sexta = 6;
        int sabado = 7;

        System.out.println("Digite um dia da semana: ");
        String entrada = sc.nextLine();

        if (entrada.equals("domingo")){
            System.out.println(domingo);
        } else if (entrada.equals("segunda")) {
            System.out.println(segunda);
        } else if (entrada.replaceAll("terça", "terca").equals("terca") ) {
            System.out.println(terca);
        } else if (entrada.equals("quarta") ) {
            System.out.println(quarta);
        } else if (entrada.equals("quinta") ) {
            System.out.println(quinta);
        } else if (entrada.equals("sexta") ) {
            System.out.println(sexta);
        } else if (entrada.replaceAll("sábado", "sabado").equals("sabado")) {
            System.out.println(sabado);
        }

        sc.close();


    }
}
