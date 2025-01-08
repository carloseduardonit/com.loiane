/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio1;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles
 *
 * @author Carlos
 */
public class QualeMaiorNumero {

    public static void main(String[] args) {
        double numero1, numero2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o 1° numero?");
        numero1 = ler.nextDouble();
        System.out.println("Informe o 2° numero?");
        numero2 = ler.nextDouble();
        if (numero1 >= numero2) {
            System.out.println(numero1 + " O primeiro numero  do que Segundo " + numero2);
        } else {
            System.out.println(numero2 + " O Segundo numero do que primeiro " + numero1);
        }
    }
}
