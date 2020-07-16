/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoBasicodeJava.aula13;

/**
 *
 * @author Carlos
 */
public class OperadorLogico {

    public static void main(String[] args) {
        boolean f = false, t = true;
        //E sem curto circuto
        System.out.println("T&T " + (t & t));
        System.out.println("F&T " + (f & t));
        System.out.println("F&F " + (f & f));
        //E com curto circuto
        System.out.println("T&&T " + (t && t));
        System.out.println("F&&T " + (f && t));
        System.out.println("F&&F " + (f && f));

        //OU sem curto circuto
        System.out.println("\nT|T " + (t | t));
        System.out.println("F|T " + (f | t));
        System.out.println("F|F " + (f | f));
        //OU com curto circuto
        System.out.println("T||T " + (t || t));
        System.out.println("F||T " + (f || t));
        System.out.println("F||F " + (f || f));

        //XOR
        System.out.println("\nT^T " + (t ^ t));
        System.out.println("F^T " + (f ^ t));
        System.out.println("F^F " + (f ^ f));
        //Not OU com curto circuto
        System.out.println("\n!T||T " + !(t | t));
        System.out.println("!F||T " + !(f || t));
        System.out.println("!F||F " + !(f || f));
    }

}
