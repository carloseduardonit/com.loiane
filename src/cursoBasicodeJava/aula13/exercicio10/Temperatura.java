/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio10;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre
 * em graus Farenheit.
 *
 * @author Carlos
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double farinheit, celsius;
        System.out.println("Informe o valor da tempetura em Celsius");
        celsius = ler.nextDouble();
        farinheit = (celsius * 9 / 5) + 32;
        System.out.println("A tempetura em Celsius: " + celsius);
        System.out.println("A tempetura em Farenheit: " + farinheit);
    }
}
