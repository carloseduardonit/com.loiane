/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio08;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 *
 * @author Carlos
 */
public class CalculoSalario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorHora, valorTotal, horaTrabalhada;
        System.out.println("Qual da sua hora de trabalho: ");
        valorHora = ler.nextDouble();

        System.out.println("Quantas horas trabalhada?");
        horaTrabalhada = ler.nextDouble();
        valorTotal = valorHora * horaTrabalhada;
        System.out.println("valor da hora: " + valorHora + " X Total de Hora trabalhada " + horaTrabalhada + " = " + valorTotal);
    }

}
