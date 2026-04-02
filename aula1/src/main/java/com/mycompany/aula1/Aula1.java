/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author gessandro.arantes
 */
public class Aula1 {

    public static void main(String[] args) {
        //System.out.println("GESSANDRO!");

        //Detecção de variaveis
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        int idade;
        double altura;
        //int conversao;
        //double soma;

        System.out.println("-".repeat(80));
        System.out.println("----Insira os valores a seguir ");
        System.out.println("");
        
        //Operações simples
        System.out.println("Digite sua idade:  ");
        idade = scan.nextInt();
        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();
        
        
        //conversao = (int) altura; 
        // soma = idade + conversao

        System.out.println("-".repeat(80));
        System.out.println("O valor da idade e :" + idade);
        System.out.println("O valor da autura e :" + altura);*/
        // Estrutura de decisão
        /*
        System.out.println("-".repeat(80));
        System.out.println("Entre com o valor da nota; ");
        double nota = scan.nextDouble();
        
        if (nota >= 0 && nota <=10){
            System.out.println("Nota valida!");
            System.out.println("\n A nota e: "+nota);
        }
        else {
            System.out.println("Nota invalida!");
            System.out.println("\n Insira valor de nota entre 0 e 10.");
       
        }*/
        /*
        while (true){
        System.out.println("=".repeat(72));
        int mes;
        System.out.println("Informe o numero do mes: ");
        mes = scan.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outrubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default: System.out.println("Mes invalido!");
        
        
        }
        System.out.println("=".repeat(72));
        }
*/
        //estrutur de repeticao
        /*
        for (int i=0; i<= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Acabou!");
        */
         /*
        int i=0;
        
        while (i <= 10){
            System.out.print(i + "");
            i++;
        }
        
        System.out.println("");
        System.out.println("Acabou!");
        */
        /*
         int i=0;
        do {
            System.out.print(i + " - ");
            i++;
        }while (i <= 10);
        
         System.out.println("");
        System.out.println("Acabou!");
*/
        //vetores
        
        int notas[] = new int[5];
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite o valor da nota");
            notas[i] = scan.nextInt();
        }
        
          for (int i = 0; i < notas.length; i++){
            System.out.println("O valor da nota numero "+( i + 1 )+ " e: " + notas[i]);
            
            
          }
         
         
                  
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
}
    































