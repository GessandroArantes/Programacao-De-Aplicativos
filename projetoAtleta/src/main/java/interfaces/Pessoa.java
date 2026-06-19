/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author gessandro.arantes
 */
public class Pessoa {
    // atributos da classe Pessoa
    private String nome, endereco;
    
    // construtor da classe Pessoa
    public Pessoa(String nome){
        this.setNome(nome);
    }
    
    //método da classe Pessoa
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
