/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio14;

import java.util.Scanner;

/**
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa
 * disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
 * conceitos obedece à tabela abaixo: o Média de Aproveitamento Conceito o Entre
 * 9.0 e 10.0 A o Entre 7.5 e 9.0 B o Entre 6.0 e 7.5 C o Entre 4.0 e 6.0 D o
 * Entre 4.0 e zero E
 *
 * @author Carlos
 */
public class NotaConceitoResultado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, media;
        String conceito = "I";
        System.out.println("Informe a 1 nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Informe a 2 nota: ");
        nota2 = ler.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media <= 4) {
            conceito = "E";
        } else if (media > 4 && media <= 6) {
            conceito = "D";
        } else if (media > 6 && media <= 7.5) {
            conceito = "C";
        } else if (media > 7.5 && media <= 9) {
            conceito = "B";
        } else if (media > 9 && media <= 10) {
            conceito = "A";
        }
        if (media >= 0 && media <= 10) {
            switch (conceito) {
                case "A":
                case "B":
                case "C":
                    System.out.println("\n1° nota: " + nota1
                            + "\n2° nota: " + nota2
                            + "\nMedia: " + media
                            + "\nConceito: " + conceito
                            + "\nSituação: Aprovado");
                    break;
                case "D":
                case "E":
                    System.out.println("\n1° nota: " + nota1
                            + "\n2° nota: " + nota2
                            + "\nMedia: " + media
                            + "\nConceito: " + conceito
                            + "\nSituação: Reprovado");
                    break;
                default:
                    break;
            }
        } else {

        }
    }
}
