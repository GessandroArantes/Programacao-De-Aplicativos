
package programa;


import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Conta c;
        c = new Conta();
        c.nome_titular = "Zé";
        c.depositar(100);
        System.out.println("Titular: "+ c.nome_titular);
        System.out.println("Saldo Atual: "+ c.saldo);
        boolean saque_efetuado = c.sacar(250);
        if (saque_efetuado)
            System.out.println("Saque Efetuado com sucesso");
        else
            System.out.println("Saque não Efetuado! Saldo Insuficiente!");
        
                
   }
}