/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula12;

import java.util.Scanner;
import sun.java2d.SurfaceData;

/**
 *
 * @author Carlos
 */
public class lerTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * System.out.println("Ler String"); String TString = scan.nextLine();
         * System.out.println("Voce digitou: " + TString);
         * System.out.println("Ler Inteiro"); int inteiro = scan.nextInt();
         * System.out.println("Voce digitou: " + inteiro);
         */
        System.out.println("Qual o seu nome completo? ");
        String nomeCompleto = scan.nextLine();
        System.out.println("seu nome completo: " + nomeCompleto);
        System.out.println("Qual o seu primeiro nome? ");
        String nome = scan.next();
        System.out.println("seu primeiro nome " + nome);
        System.out.println("Qual sua idade? ");
        int idade = scan.nextInt();
        System.out.println("sua idade e " + idade);
        System.out.println("Qual a sua altura?");
        double altura = scan.nextDouble();
        System.out.println("sua altura e " + altura);

    }
}
