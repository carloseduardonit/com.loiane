/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SwitchCase1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o dia da semana");
        int dia = ler.nextInt();
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia uteis");
                break;
            case 7:
            case 1:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia Semanal errado");
        }
    }
}
