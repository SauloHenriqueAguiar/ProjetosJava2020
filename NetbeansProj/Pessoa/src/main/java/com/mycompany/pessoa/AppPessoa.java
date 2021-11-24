
package com.mycompany.pessoa;


public class AppPessoa {
    public static void main(String args[]){
        
        pessoa p  = new pessoa();
        p.nome = "Saulão";
        p.email  ="saulaoroludo";
        p.salario  = 6000;
        
        p.aumentarSalario(15);
        p.exibirDados();
        
        
        
        
        
    }
}
