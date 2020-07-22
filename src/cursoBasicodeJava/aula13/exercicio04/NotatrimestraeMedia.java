/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio04;

import java.util.Scanner;

/**
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média
 *
 * @author Carlos
 */
public class NotatrimestraeMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media, nota1, nota2, nota3, nota4;
        System.out.println("Informe o 1 nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Informe o 2 nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Informe o 3 nota: ");
        nota3 = ler.nextDouble();
        System.out.println("Informe o 4 nota: ");
        nota4 = ler.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("1 Trimestre: " + nota1
                + "\n2 Trimestre: " + nota2
                + "\n3 Trimestre: " + nota3
                + "\n4 Trimestre: " + nota4
                + "\nSua Media: " + media);

    }
}
