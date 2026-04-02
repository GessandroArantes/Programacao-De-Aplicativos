/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadedeprogramacaojava01;

import java.util.Scanner;

/**
 *
 * @author gessandro.arantes
 */
public class AtividadeDeProgramacaoJava01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("-".repeat(50));
        System.out.println("Digite sua idade para saber se você pode votar: ");
        idade = scan.nextInt();

        if ((idade > 0) && (idade < 16)) {
            System.out.println("Você tem " + idade + " anos não pode votar!");
        }
        if ((idade >= 16 && idade <= 17) || idade > 65) {
            System.out.println("Você tem " + idade + " anos. Voto opcional!");
        }
        else if (idade < 0){
            System.out.println("Idade Invalida.");
        }
        else {
            System.out.println("Você tem " + idade + " anos. Voto Obrigatório!");
        }

        scan.close();

    }
}



