
package com.mycompany.bombadecombustivel;


public class Posto {
     public static void main(String args[]){
         
         BombaDeCombustivel b1,b2; 
                 
          b1 = new BombaDeCombustivel("Gasolina",3.99f);
          b2 = new BombaDeCombustivel("Gasolina",2.39f);
          
         b1.puxarGancho();
         b1.abastecerPorLitros(20);
         
         
    }
}
