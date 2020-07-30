/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio10;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar
 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
 * Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 *
 * @author Carlos
 */
public class Turno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o turno que voçe estuda?"
                + "\n\tM para Matutino,"
                + "\n\tV para Vespertino,"
                + "\n\tN para Noturno.");
        String turno = ler.next();
        switch (turno.toUpperCase()) {
            case "M":
            case "MATUTINO":
                System.out.println("Bom Dia!");
                break;
            case "V":
            case "VESPETINO":
                System.out.println("Bom Tarde!");
                break;
            case "N":
            case "NOTURNO":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Invalido!");
        }
    }
}
