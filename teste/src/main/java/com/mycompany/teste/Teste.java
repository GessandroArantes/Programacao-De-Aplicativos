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

        int numero = 0;
        int soma = 0;
        int qtdNumero = 0;
        double media = 0.0;

        System.out.println("*".repeat(50));
        System.out.println("“Leitura de Números Inteiros com Condição de Parada e Cálculo da Média”");

        while (true) {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            if (numero >= 0) {
                soma += numero;
                qtdNumero++;
                media = soma / qtdNumero;
            } else {
                System.out.println("Resultado");
                System.out.println("A soma dos numeros digitados: " + soma);
                System.out.println("Quatidade de numeros digitados: " + qtdNumero);
                System.out.println("Medias dos numeros digitados: " + media);

            }

        }
    }
}