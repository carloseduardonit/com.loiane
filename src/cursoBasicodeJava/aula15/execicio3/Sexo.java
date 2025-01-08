/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Sexo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual e o seu Sexo?"
                + "\n\tM ou F");
        String sexo = ler.next();
        switch (sexo.toLowerCase()) {
            case "m":
                System.out.println("Sexo Masculino");
                break;
            case "f":
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Sexo Invalido");
        }
    }
}
