/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula15.execicio21;

import java.util.Scanner;

/**
 * 21.Um posto está vendendo combustíveis com a seguinte tabela de descontos: .
 * Álcool: a. até 20 litros, desconto de 3% por litro b. acima de 20 litros,
 * desconto de 5% por litro Gasolina: c. até 20 litros, desconto de 4% por litro
 * d. acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia
 * o número de litros vendidos, o tipo de combustível (codificado da seguinte
 * forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo
 * clientesabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro
 * do álcool é R$ 1,90
 *
 * @author Carlos
 */
public class Combustivel {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double precoVendaGasolina = 2.50, precoVendaAlcool = 1.90;
        int gasTaxaDesconto_20 = 4, gasTaxaDesconto20 = 6;
        int alcTaxaDesconto_20 = 3, alcTaxaDesconto20 = 5;
        double precoTotalGasolina, precoTotalAlcool;
        double totalCombustivel;
        double quantidadeGasolina = 0, quantidadeAlcool = 0;
        System.out.println("Digite 1 abastecer Gasolina:"
                + "\nDigite 2 abastecer Alcool"
                + "\nDigite 3 abastecer Alcool e Gasolina");
        int opçao = ler.nextInt();
        switch (opçao) {
            case 1:
                System.out.println("Quanto de Gasolina?");
                quantidadeGasolina = ler.nextDouble();
                break;
            case 2:
                System.out.println("Quanto de Alcool?");
                quantidadeAlcool = ler.nextDouble();
                break;
            case 3:
                System.out.println("Quanto de Alcool?");
                quantidadeAlcool = ler.nextDouble();
                System.out.println("Quanto de Gasolina?");
                quantidadeGasolina = ler.nextDouble();
                break;
        }
        if (quantidadeAlcool == 0) {
            precoTotalAlcool = 0;
        } else if (quantidadeAlcool <= 20.00) {
            precoTotalAlcool = quantidadeAlcool * precoVendaAlcool - (quantidadeAlcool * precoVendaAlcool * alcTaxaDesconto_20 / 100);
        } else {
            precoTotalAlcool = quantidadeAlcool * precoVendaAlcool - (quantidadeAlcool * precoVendaAlcool * alcTaxaDesconto20 / 100);
        }
        if (quantidadeGasolina == 0) {
            precoTotalGasolina = 0;
        } else if (quantidadeGasolina <= 20.00) {
            precoTotalGasolina = quantidadeGasolina * precoVendaGasolina - (quantidadeGasolina * precoVendaGasolina * gasTaxaDesconto_20 / 100);
        } else {
            precoTotalGasolina = quantidadeGasolina * precoVendaGasolina - (quantidadeGasolina * precoVendaGasolina * gasTaxaDesconto20 / 100);
        }
        totalCombustivel = precoTotalAlcool + precoTotalGasolina;
        System.out.println("\nVoce comprou "
                + "\n" + quantidadeAlcool + " litros de Alcool de R$ " + precoTotalAlcool
                + "\n" + quantidadeGasolina + " litros de Gasolina de R$ " + precoTotalGasolina
                + "\ntotal de combustivel R$ " + totalCombustivel);
    }
}
