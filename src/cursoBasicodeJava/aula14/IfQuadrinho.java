/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula14;

/**
 *
 * @author Carlos
 */
public class IfQuadrinho {

    public static void main(String[] args) {
        boolean temBatata = true;
        int ovos = 6;
        if (temBatata) {
            ovos = 9;
        }
        System.out.println("Compre " + ovos + " ovos.");
    }
}
