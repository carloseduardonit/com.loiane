/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio12;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class DescontoSalario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidadeHora, taxaDesconto;
        double valorHora, salarioBruto, salarioLiquido;
        double valorIR, valorINSS, totalDesconto, valorFGTS, valorSindicato;
        System.out.println("Qual a quantidade de hora trabalhada? ");
        quantidadeHora = ler.nextInt();
        System.out.println("Qual o valor da sua hora trabalhada");
        valorHora = ler.nextDouble();
        salarioBruto = quantidadeHora * valorHora;
        valorFGTS = salarioBruto * 11 / 100;
        valorINSS = salarioBruto * 10 / 100;
        if (salarioBruto <= 900) {
            taxaDesconto = 0;
        } else if (salarioBruto <= 1500) {
            taxaDesconto = 5;
        } else if (salarioBruto <= 2500) {
            taxaDesconto = 10;
        } else {
            taxaDesconto = 20;
        }
        valorIR = salarioBruto * taxaDesconto / 100;
        valorSindicato = salarioBruto * 3 / 100;
        totalDesconto = valorINSS + valorIR;
        salarioLiquido = salarioBruto - totalDesconto;
        System.out.println("\n\nSalario Bruto: (" + valorHora + " X " + quantidadeHora + ") = " + salarioBruto
                + "\n(-) IR (" + taxaDesconto + "%) = " + valorIR
                + "\n(-) INSS (10%) = " + valorINSS
                + "\nFGTS (11%) = " + valorFGTS
                + "\nSindicato = " + valorSindicato
                + "\nTotal de descontos = " + totalDesconto
                + "\nSalario Liquido = " + salarioLiquido);
    }
}
