package atividadepraticajava02;

public class Conta {

    
    int numero;
    String nome_titular;
    double saldo, valor;
    
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
   

