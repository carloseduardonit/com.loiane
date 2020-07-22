/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio2;

import java.util.Scanner;

/**
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
 * negativo.
 *
 * @author Carlos
 */
public class PositivoNegativo {

    public static void main(String[] args) {
        double numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero?");
        numero = ler.nextDouble();
        if (numero > 0) {
            System.out.println("Positivo");
        } else {
            if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Nulo");
            }
        }
    }
}
