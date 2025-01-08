/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio06;

import java.util.Scanner;

/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 *
 * @author Carlos
 */
public class CauculeCirculo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, area, diametro, pi = Math.PI;
        System.out.println("Informe o raio?");
        raio = ler.nextDouble();
        diametro = raio * 2;
        area = raio * raio * pi;
        System.out.println("\nRaio: " + raio
                + "\nDiamento: " + diametro
                + "\nArea: " + area
                + "\narea: " + pi * Math.pow(raio, 2));
    }
}
