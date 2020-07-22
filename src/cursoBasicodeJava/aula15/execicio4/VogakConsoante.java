/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio4;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 *
 * @author Carlos
 */
public class VogakConsoante {

    public static void main(String[] args) {
        System.out.println("Digite uma letra: ");
        Scanner ler = new Scanner(System.in);
        String letra = ler.next();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("e vogal");
                break;
            default:
                System.out.println("e Consoante");
        }
    }
}
