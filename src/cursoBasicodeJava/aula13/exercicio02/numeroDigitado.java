/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio02;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número e então mostre a mensagem O número
 * informado foi [número].
 *
 * @author Carlos
 */
public class numeroDigitado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = ler.nextInt();
        System.out.println("O número informado foi " + numero);
    }
}
