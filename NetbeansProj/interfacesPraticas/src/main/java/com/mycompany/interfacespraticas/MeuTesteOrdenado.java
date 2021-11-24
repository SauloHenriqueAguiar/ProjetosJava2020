
package com.mycompany.interfacespraticas;
import java.util.ArrayList;
 import java.util.Collections;//importa o pacote para ordenar os nomes

public class MeuTesteOrdenado {
    public static void main(String args[]){
        
        ArrayList<Players> listanomes = new ArrayList<>();
        
        listanomes.add(new Players(1,"Flavaobritones",63.3f));
        listanomes.add(new Players(2,"saulaopnf",77.5f));
        listanomes.add(new Players(3,"goah323",10.7f));
        listanomes.add(new Players(4,"sqer532",10.7f));
       
        
        
     System.out.println("imprimindo a lista...");
    Collections.sort(listanomes);//ordena os nomes por ordem alfabetica
    listanomes.forEach((p) -> {
        System.out.println("Nome =  " + p);
        });
        
        
        
        
    }
}
