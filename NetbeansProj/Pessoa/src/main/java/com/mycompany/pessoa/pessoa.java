
package com.mycompany.pessoa;


public class pessoa {
 String nome;
 String email;
 float salario;
 
 
 void aumentarSalario(float indice){
     salario = (salario + indice*salario/100);  
     
 }
    
    void exibirDados(){
        System.out.println("Sistema Pessoa **** ");
        System.out.println("Nome: " + nome + "(" + email + ")" );
        System.out.println("Salario R$: " + salario);
        
    }
    
}
