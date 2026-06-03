
package atividadepraticajava02;

public class ContaEspecial extends Conta{
    
    // construtor da subclasse ContaEspecial
    public ContaEspecial(int numero, String nome_titular, double limite){
        super(numero, nome_titular);
        this.limite = limite;
    }
      // declaração dos atributos da classe   
    private double limite;
    
    //declaração dos métodos da classe.
@Override
public boolean sacar(double valor) {
    if (valor <= this.limite + this.saldo) {
        this.saldo -= valor;
        return true;
    }
    else{
        return false;
    }
}
    // declaração dos métodos da classe.
    @Override
    public void imprimiTipoConta() {
        System.out.println("Conta Especial");
    }
    
    // declaração dos métodos da classe
    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}