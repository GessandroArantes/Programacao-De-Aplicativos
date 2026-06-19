/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author gessandro.arantes
 */
public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista{
    
    //construtor da classe Triatleta
    public Triatleta(String nome) {
         super(nome);
    }
    
   //métodos da classe Triatleta
    public void aquecer(){
        System.out.println(this.getNome() + "está aquecendo");
    }
    
    public void nadar(){
        System.out.println(this.getNome() + "está nadando");
    }
    
    public void correr(){
        System.out.println(this.getNome() + "está correndo");
    }
    
    public void correrDeBicicleta(){
        System.out.println(this.getNome() + "está correndo de bike");
    }
    
}
