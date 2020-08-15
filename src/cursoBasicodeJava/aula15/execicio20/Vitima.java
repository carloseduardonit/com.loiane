/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio20;

import java.util.Scanner;

/**
 * 20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
 * perguntas são: . "Telefonou para a vítima?" a. "Esteve no local do crime?" b.
 * "Mora perto da vítima?" c. "Devia para a vítima?" d. "Já trabalhou com a
 * vítima?" O programa deve no final emitir uma classificação sobre a
 * participação da pessoa no crime. Se a pessoa responder positivamente a 2
 * questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
 * "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
 * "Inocente".
 *
 * @author Carlos
 */
public class Vitima {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int count = 0;
        System.out.println("Telefonou para a vítima?");
        String reString = ler.next();
        if (reString.equalsIgnoreCase("sim") || reString.equalsIgnoreCase("s")) {
            count++;
        }
        System.out.println("Esteve no local do crime?");
        reString = ler.next();
        if (reString.equalsIgnoreCase("sim") || reString.equalsIgnoreCase("s")) {
            count++;
        }
        System.out.println("Mora perto da vítima?");
        reString = ler.next();
        if (reString.equalsIgnoreCase("sim") || reString.equalsIgnoreCase("s")) {
            count++;
        }
        System.out.println("Devia para a vítima?");
        reString = ler.next();
        if (reString.equalsIgnoreCase("sim") || reString.equalsIgnoreCase("s")) {
            count++;
        }
        System.out.println("Já trabalhou com a vítima?");
        reString = ler.next();
        if (reString.equalsIgnoreCase("sim") || reString.equalsIgnoreCase("s")) {
            count++;
        }
        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
