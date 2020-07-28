/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio06;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior deles
 *
 * @author Carlos
 */
public class MaioremTres {

    public static void main(String[] args) {
        double numero, numero1, numero2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o 1° numero");
        numero = ler.nextDouble();
        System.out.println("Informe o 2° numero");
        numero1 = ler.nextDouble();
        System.out.println("Informe o 3° numero");
        numero2 = ler.nextDouble();
        if (numero >= numero1) {
            if (numero >= numero2) {
                System.out.println("O Primeiro e maior que e " + numero);
            } else {
                System.out.println("O Terceiro e maior que e " + numero2);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println("O Segundo e maior que e " + numero1);
            } else {
                System.out.println("O Terceiro e maior que e " + numero2);
            }
        }
    }
}
