/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

/**
 *
 * @author gessandro.arantes
 */
public class Conta {
    
    int numero;
    String nome_titular;
    double saldo;
    
    void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }       
}
