/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadedeprogramacaojava03;


import java.util.Scanner;

/*

Faça um programa que fique em laço solicitando a digitação de números inteiros maiores ou iguais
a zero. Quando o usuário digitar um número menor que zero, o programa deve exibir a
quantidade de números digitados e a média desses números.

 */
public class AtividadeDeProgramacaoJava03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        
        
        int quantidade = 0;
        double valor = 0, soma = 0, media = 0;

        System.out.println("*".repeat(50));
        System.out.println("Leitura de Números Inteiros com Condição de Parada e Cálculo da Média");
        System.out.println("");

       do {
            System.out.print(" Digite um valor maior ou igual a zero ");
            valor = scan.nextDouble();
            if (valor < 0){
                break;
            }
            soma += valor;
            quantidade++;
            media = soma / quantidade; 
        }while (valor >= 0);
         
            
                System.out.println("Quatidade de numeros digitados: " + quantidade);
                System.out.println("Medias dos numeros digitados:" + media);

            }

        }
