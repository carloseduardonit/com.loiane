/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio05;

import java.util.Scanner;

/**
 * Faça um Programa que converta metros para centímetros.
 *
 * @author Carlos
 */
public class ConversaoMTparaCM {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double metro, conversao;
        int centimetro = 100;
        System.out.println("Quantos Metros: ");
        metro = ler.nextDouble();
        conversao = metro * centimetro;
        System.out.println("Os " + metro + " Mt equivale a " + conversao + "CM");
    }
}
