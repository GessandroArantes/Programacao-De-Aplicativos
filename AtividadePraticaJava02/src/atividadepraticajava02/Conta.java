package atividadepraticajava02;

public class Conta {

    //declaração dos atributos da classe Conta.
private int numero;
private String nome_titular;
protected double saldo;

//definição dos construtores da classe Conta.
public Conta(int numero, String nome_titular, double saldo){
    this.numero = numero;
    this.nome_titular = nome_titular;
    this.saldo = saldo;
}

public Conta(int numero, String nome_titular){
    this.numero = numero;
    this.nome_titular = nome_titular;
    saldo = 0;
}

    //declaração dos métodos da classe Conta.
   public void imprimiTipoConta() {
    System.out.println("Conta comum");
}
   public void imprimiTipoConta(String s) {
    System.out.println("Conta comum - String recebida: " + s);
}
    
    void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor){
        if (this.saldo >= valor){
             this.saldo = this.saldo - valor;
          return(true);
        }
        else
          return false;
        }  
    

    
    
    }
   

