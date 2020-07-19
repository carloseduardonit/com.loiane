/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula14;

import java.util.Scanner;

/**
 * 8.54
 *
 * @author Carlos
 */
public class IfElseAlinhado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = ler.nextInt();
        if (valor <= 10) {
            System.out.println("Esta Barato");
        } else if (valor < 15) {
            System.out.println("Pedir desconto");
        } else if (valor < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }
    }
}
