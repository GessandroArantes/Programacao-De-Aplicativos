/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadedeprogramacaojava02;

import java.util.Scanner;

/*
2. Crie um programa que armazene um vetor com as notas de dez alunos, calcule e imprima a média
dessas notas e depois informe a quantidade de notas acima e abaixo da média calculada.

 */
public class AtividadeDeProgramacaoJava02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double notas[] = new double[10];
        double soma = 0.0;
        double media = 0.0;
        int notasAcima = 0, notasAbaixo = 0;

        System.out.println("-".repeat(50));
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o valor da " + (i + 1) + "ª nota e:");
            notas[i] = scan.nextDouble();
            soma += notas[i];
            media = soma / notas.length;
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                notasAcima++;
            }
            if (notas[i] < media) {
                notasAbaixo++;
            }    
        }
            System.out.println("");
            System.out.println("A soma das notas é: " + soma);
            System.out.println("A média das notas é: " + media);
            System.out.println("A quantidade de números acima da média é: " + notasAcima);
            System.out.println("A quantidade de números abaixo da média é: " + notasAbaixo);
            
            scan.close();
    }
}
