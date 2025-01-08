/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula09;

/**
 *
 * @author Carlos
 */
public class Cachorro extends Animal {

    private String nome, nomeRaça, grupo, porte, temperamento, nivelAtividade, inteligencia;
    private double altura, peso, tempoVida;

    public void passer() {
        System.out.println(nome + " gosta de passear ");
    }

    public void comer() {
        System.out.println(nome + " comer a ração.");
    }

}
