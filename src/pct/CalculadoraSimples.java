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
        int n1, n2, opcao;
        double total;
        
        
        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        do{      
            //Apresentação
            System.out.println("\n\t -- Calculadora um pouco simples --\n");

            //Menu
            System.out.println("\t\t[1] Para soma");
            System.out.println("\t\t[2] Para subtração");
            System.out.println("\t\t[3] Para multiplicaçao");
            System.out.print("\t\t[4] Para Sair: ");
            opcao = entrada.nextInt();
            
            if (opcao!=4){
                //Entradas
                System.out.print("\n\n\t\tInforma N1: ");
                n1 = entrada.nextInt();
                System.out.print("\t\tInforma N2: ");
                n2 = entrada.nextInt();
                switch (opcao){
                        case 1:
                            total = n1 + n2;
                            System.out.printf("\n\t\t %d + %d = %f \n", n1, n2, total);                    
                            break;
                        case 2:
                            total = n1 - n2;
                            System.out.printf("\n\t\t %d - %d = %f \n", n1, n2, total);
                            break;
                        case 3:
                            total = n1 * n2;
                            System.out.printf("\n\t\t%d * %d = %f \n", n1, n2, total);
                            break;
                        default:
                            System.out.println("\t\t\t Entrada incorreta ....");
                }
            }else 
                break;
        }while(opcao!=4);
    }
}
