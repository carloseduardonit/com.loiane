package cursoBasicodeJava.aula13.exercicio09;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * o C = (5 * (F-32) / 9)
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double farenheit, celsius;
        System.out.println("Informe o valor da temperatura em Farenheit");
        farenheit = ler.nextDouble();
        celsius = 5 * (farenheit - 32) / 9;
        System.out.println("A tempetura em Farenheit: " + farenheit +
                "\nA tempetura em Celsius: " + celsius);
    }
}