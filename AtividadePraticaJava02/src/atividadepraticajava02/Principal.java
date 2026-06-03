package atividadepraticajava02;

import java.util.Scanner;


   public class Principal {

    public static void main(String[] args) {
        
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Qual tipo de conta deseja criar para José?");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta especial");
        System.out.println("3 - Conta poupança");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                c = new Conta(1, "José");
                break;
            case 2:
                c = new ContaEspecial(1, "José", 100.00);
                break;
            case 3:
                c = new ContaPoupanca(1, "José");
                break;
        }
        c.imprimirTipoConta();
    
    }
}



















/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
         Código feito para os exercícios anteriores ao Herança e Polimorfismo.
        Scanner scan = new Scanner(System.in);
        Conta c = null; // Inicializado para evitar erros de compilação
        int contadorNumeroConta = 0, numeroConsulta = 0, opcao = 0;
        ArrayList lista = new ArrayList();
        double valor = 0;
        boolean resposta;

        System.out.println("******* Sistema Bancario Online *******\n");

        System.out.println("""
              ********** Menu de Selecao **********
                                   
                Informe a opcao desejada abaixo:
                1 - Criar conta
                2 - Saldo
                3 - Sacar
                4 - Depositar
                5 - Sair
                """);
        
        opcao = scan.nextInt();

        while (opcao >= 1 && opcao <= 4) {
            boolean respostaBusca = false;
            Iterator i = lista.iterator();

            switch (opcao) {
                case 1:
                    c = new Conta();
                    System.out.println("******* Informe o nome do (a)titular da conta: ");
                    c.nome_titular = scan.nextLine();

                    System.out.println("******* \nInforme o saldo atual da conta: ");
                    c.saldo = scan.nextDouble();

                    contadorNumeroConta++;
                    c.numero = contadorNumeroConta;
                    System.out.println("\nO numero da sua conta e: " + c.numero);

                    lista.add(c);
                    break;

                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numeroConsulta = scan.nextInt();

                    while (i.hasNext()) {
                        c = (Conta) i.next();
                        if (c.numero == numeroConsulta) {
                            System.out.println("\n O saldo atual da conta e: " + c.saldo);
                            respostaBusca = true;
                            break;
                        }
                    }
                    if (!respostaBusca) {
                        System.out.println("Numero da conta esta incorreto");
                    }
                    break;

                case 3:
                    System.out.println("Informe o numero da conta: \n");
                    numeroConsulta = scan.nextInt();

                    while (i.hasNext()) {
                        c = (Conta) i.next();
                        if (c.numero == numeroConsulta) {
                            System.out.println("Informe o valor que se deseja sacar da conta: \n");
                            valor = scan.nextDouble();
                            resposta = c.sacar(valor);
                            respostaBusca = true;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Informe o numero da conta: \n");
                    numeroConsulta = scan.nextInt();

                    while (i.hasNext()) {
                        c = (Conta) i.next(); // Adicionada a iteração que faltava aqui
                        if (c.numero == numeroConsulta) {
                            System.out.println("Informe o valor que se deseja depositar na conta: ");
                            valor = scan.nextDouble();
                            c.depositar(valor);
                            respostaBusca = true;
                        }
                    }
                    break;

                default:
                    break;
            }

            System.out.println("""
                  ********** Menu de Selecao **********
                                       
                    Informe a opcao desejada abaixo:
                    1 - Criar conta
                    2 - Saldo
                    3 - Sacar
                    4 - Depositar
                    5 - Sair
                    """);
            opcao = scan.nextInt(); // Adicionado para atualizar a variável e permitir a saída do laço
        }*/
        
     