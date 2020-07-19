/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio12;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 *
 * @author Carlos
 */
public class PesoIdeal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altura, pesoIdeal;
        System.out.println("Qual a sua altura? ");
        altura = ler.nextDouble();
        pesoIdeal = 72.7 * altura - 58;
        System.out.println("\nA sua altura e " + altura
                + "\ne seu peso ideal e " + pesoIdeal);

    }
}
