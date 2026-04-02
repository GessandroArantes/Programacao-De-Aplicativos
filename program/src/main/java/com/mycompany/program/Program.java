/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;


public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual é o preço do dólar? ");
        double cotacaoDolar = sc.nextDouble();
        
        System.out.print("Quantos dólares serão comprados? ");
        double quantia = sc.nextDouble();
        
        double resultado = CurrencyConverter.dolarParaReal(quantia, cotacaoDolar);
        
        System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
        
        sc.close();
    }
}