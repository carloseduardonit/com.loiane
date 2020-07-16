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
public class OperadorArrimetico {

    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);
        resultado = resultado - 1;
        System.out.println(resultado);
        resultado = resultado * 2;
        System.out.println(resultado);
        resultado = resultado / 2;
        System.out.println(resultado);
        resultado = resultado + 8;
        resultado = resultado % 7;
        System.out.println(resultado);
        resultado = +1;
        System.out.println(resultado);
        resultado--;
        System.out.println(resultado);
        resultado++;
        System.out.println(resultado);
        resultado = -resultado;
        System.out.println(resultado);
        String primeiroNome = "Carlos";
        String segundoNome = " Eduardo";
        String terceiraNome = primeiroNome + segundoNome;
        System.out.println(terceiraNome);
        boolean sucesso = true;
        System.out.println(sucesso);
        System.out.println(!sucesso);
    }

}
