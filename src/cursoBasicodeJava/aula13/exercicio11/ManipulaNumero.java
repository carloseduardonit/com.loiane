/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio11;

import java.util.Scanner;

/**
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e
 * mostre: a. o produto do dobro do primeiro com metade do segundo . b. a soma
 * do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo
 *
 * @author Carlos
 */
public class ManipulaNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        double num3;
        System.out.println("Informe o 1 numero Inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Informe o 2 numero Inteiro: ");
        num2 = ler.nextInt();
        System.out.println("Informe o numero com ponto frutuante: ");
        num3 = ler.nextDouble();
        System.out.println("o produto do dobro do primeiro = " + num1 + " "
                + "com metade do segundo = " + num2 + " e " + ((num1 * 2) * (num2 / 2)));
        System.out.println("a soma do triplo do primeiro " + num1 + " com o terceiro " + num3 + " e " + (3 * num1 + num3));
        System.out.println("o terceiro = " + num3 + " elevado ao cubo e " + Math.pow(num3, 3));
    }
}
