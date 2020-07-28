/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio07;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class MaioreMenor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double maior, menor, numero, numero1, numero2;
        System.out.println("Informe o 1° numero:");
        numero = ler.nextDouble();
        System.out.println("Informe o 2° numero:");
        numero1 = ler.nextDouble();
        System.out.println("Informe o 3° numero:");
        numero2 = ler.nextDouble();
        maior = numero;
        menor = numero;
        if (maior >= numero1) {
            maior = maior;
        } else {
            maior = numero1;
            if (maior >= numero2) {
                maior = maior;
            } else {
                maior = numero2;
            }
        }
        // -------------------------//
        System.out.println("" + maior);
        if (menor <= numero1) {
            menor = menor;
            System.out.println(menor);
        } else {
            menor = numero1;
            if (menor <= numero2) {
                menor = menor;
            } else {
                menor = numero2;
            }
            System.out.println("" + menor);
        }
    }
}
