/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13.exercicio14;

import java.util.Scanner;

/**
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
 * velocidade de um link de Internet (em Mbps), calcule e informe o tempo
 * aproximado de download do arquivo usando este link (em minutos)
 *
 * @author Carlos
 */
public class TaxaBaixa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tamanhoArquivo, velocidade, tempo;
        System.out.println("Qual e tamanho do arquivo? ");
        tamanhoArquivo = ler.nextDouble();
        System.out.println("Qual a velocidade da sua internet?");
        velocidade = ler.nextDouble();
        tempo = tamanhoArquivo / velocidade;
        System.out.println("Este arquivo com tamanho: " + tamanhoArquivo
                + " MB\ncom a velocidade permanente de " + velocidade
                + " dura " + tempo + " minutos.");
    }
}
