/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class CalculadoraSimples {
    public static void main(String[] args) {
        //Declaração de variaveis
        int n1, n2, total;
        
        //Criação e instancia do objeto de entrada
        Scanner entrada= new Scanner(System.in);
        
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        
        //Entrada
        System.out.print("Informa N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informa N2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 + n2;
        
        //Saída
        System.out.printf("n\t %d + %d = %d \n", n1, n2, total);
    }
}
