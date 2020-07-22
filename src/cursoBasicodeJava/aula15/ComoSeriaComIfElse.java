package cursoBasicodeJava.aula15;

import java.util.Scanner;

public class ComoSeriaComIfElse {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o dia da semana:");
        int diaSemana = ler.nextInt();
        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Dia Semanal errado");
        }
    }
}
