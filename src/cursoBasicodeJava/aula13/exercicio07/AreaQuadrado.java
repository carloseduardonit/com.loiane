/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio07;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado, perimetro, area;
        System.out.println("Informe o valor do lado");
        lado = ler.nextDouble();
        perimetro = lado + lado + lado + lado;
        area = lado * lado;
        System.out.println("\nlado: " + lado
                + "\nPerimetro: " + perimetro
                + "\nArea: " + area
                + "\nDobro da Area: " + 2 * area
                + "\nArea: " + Math.pow(lado, 2)
                + "\nDobro da Area: " + 2 * Math.pow(lado, 2));
    }
}
