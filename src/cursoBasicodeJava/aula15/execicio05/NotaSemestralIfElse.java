/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio05;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class NotaSemestralIfElse {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero, numero1, media;
        System.out.println("Informe a 1° nota:");
        numero = ler.nextDouble();
        System.out.println("Informe a 2° nota:");
        numero1 = ler.nextDouble();
        media = (numero + numero1) / 2;
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
