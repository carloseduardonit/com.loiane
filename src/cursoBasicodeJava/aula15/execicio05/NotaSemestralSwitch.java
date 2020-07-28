/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio05;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class NotaSemestralSwitch {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero, numero1, media;
        System.out.println("Informe a 1° nota:");
        numero = ler.nextDouble();
        System.out.println("Informe a 2° nota:");
        numero1 = ler.nextDouble();
        media = (numero + numero1) / 2;
        switch ((int) media) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Reprovado");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Aprovado");
                break;
            case 10:
                System.out.println("Aprovado com Distinção");
                break;
        }
    }
}
