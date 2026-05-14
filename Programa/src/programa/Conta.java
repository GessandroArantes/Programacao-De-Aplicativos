package programa;

public class Conta {
    
    double valor_deposito;
    String nome_titular;
    double saldo;
    
    void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    
        
    boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
          return(true);
        }
        else
          return false;
        }  
    }
   

