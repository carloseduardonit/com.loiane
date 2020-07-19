/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio13;

import java.util.Scanner;

/**
 * 13.Faça um Programa que pergunte quanto você ganha por hora e o número de
 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
 * INSS e 5% para o sindicato, faça um programa que nos dê: . salário bruto. a.
 * quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d.
 * calcule os descontos e o salário líquido, conforme a tabela abaixo: + Salário
 * Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário
 * Liquido : R$Obs.: Salário Bruto - Descontos = Salário Líquido.
 *
 * @author Carlos
 */
public class SalarioDesconto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double inss = 0.08, ir = 0.11, sin = 0.05;
        double salarioBruto, valorINSS, valorIR, valorSin, salarioLiquido;
        System.out.println("Qual e o seu Salario Bruto: ");
        salarioBruto = ler.nextDouble();
        valorINSS = salarioBruto * inss;
        valorIR = salarioBruto * ir;
        valorSin = salarioBruto * sin;
        salarioLiquido = salarioBruto - valorINSS - valorIR - valorSin;
        System.out.println("Salario Bruto: " + salarioBruto
                + "\n- Valor do imposto de Renda: " + valorIR
                + "\n- Valor do INSS: " + valorINSS
                + "\n- Valor do Sindicado: " + valorSin
                + "\n= Salario Liquido: " + salarioLiquido);
    }
}
