/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula14;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos anos vc tem?");
        int idade = ler.nextInt();
        if (idade >= 18) {
            System.out.println("E maior de idade");
        } else {
            System.out.println("E menor de idade");
        }
    }
}
