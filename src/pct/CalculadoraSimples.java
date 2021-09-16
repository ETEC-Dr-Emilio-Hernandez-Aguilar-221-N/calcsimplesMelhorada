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
        int n1, n2, total, opcao;
        
        //Atribuiçao inicial
        n1 = 0;
        n2 = 0;
        
        //Criação e instancia do objeto de entrada
        Scanner entrada= new Scanner(System.in);
       
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        //Menu
        System.out.println("\t[1] Para Soma\n\t[2] Para Subtração\n\t[3] Para sair");
        System.out.print("\nDigite sua opção: ");
        opcao = entrada.nextInt();


        if (opcao > 0 && opcao < 4) {
            //Entradas
            System.out.print("Informa N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informa N2: ");
            n2 = entrada.nextInt();

            if (opcao == 1){           
                //Processamento
                total = n1 + n2;
                //Saída
                System.out.printf("\n\t %d + %d = %d \n", n1, n2, total);

            } else if (opcao == 2){
                //Processamento
                total = n1 - n2;
                //Saída
                System.out.printf("\n\t %d - %d = %d \n", n1, n2, total);

            } 
        }else {
            System.out.println("Opção invalida!");
        }
        //Saída1
        System.out.println("\n\t\t\t -- Programa Encerrado --\n");
       
                
        
    }
}
