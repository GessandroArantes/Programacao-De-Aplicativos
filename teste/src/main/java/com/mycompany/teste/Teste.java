package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Conta c;
        c = new Conta();
        
        System.out.println("Digite seu nome: ");
        c.nome_titular = scan.nextLine();
        
        System.out.println("Digite o valor do seu saldo: ");
        c.saldo = scan.nextDouble();
        
        System.out.println("Digite o valor que voce deseja depositar");
        double valorDeposito = scan.nextDouble();
        c.depositar(valorDeposito);
        
        System.out.println("Titular: " + c.nome_titular);
        System.out.println("Saldo Atual: " + c.saldo);
        
        boolean saque_efetuado = c.sacar(250);
        
        if (saque_efetuado) {
            System.out.println("Saque Efetuado com sucesso");
        } else {
            System.out.println("Saque não Efetuado! Saldo Insuficiente!");
        }
    }
}