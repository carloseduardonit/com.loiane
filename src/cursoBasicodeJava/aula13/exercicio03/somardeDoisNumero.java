/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio03;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima a soma.
 *
 * @author Carlos
 */
public class somardeDoisNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double parcela, parcela1, somar;
        System.out.println("Informe o valor da 1 parcela: ");
        parcela = ler.nextInt();
        System.out.println("Informe o valor da 2 parcela: ");
        parcela1 = ler.nextInt();
        somar = parcela + parcela1;
        System.out.println("A soma  de " + parcela + " + " + parcela1 + " = " + somar);
    }
}
