
package com.mycompany.cliente;

public class LojasSaulao {
    public static void main (String args[]){
    cliente c1,c2;
    
    c1=new cliente("José","jose@gmail.com",500);
    c2=new ClienteVip("Carlos","cmg@gmail.com",500,200);
    
    System.out.println(c1);
    System.out.println(c2);
    
        //vou comprar
      if (c2.fazerCompra(650)){
          System.out.println("conseguiu Comprar");
      }else{
          System.out.println("Saldo insuficiente");
      }  
System.out.println(c2);
}
}
/*pode usar vetores tbm
cliente []clientes;
clientes = new Clientes[5];

clientes[0]  = new Cliente("jorge","hgb@gmal.com",500);
clientes[1]  = new ClienteVip("victor","gaer@gmal.com",400,200);
clientes[2]  = new Cliente("jose","rwf@gmal.com",400);
clientes[3]  = new Cliente("edson","eds@gmal.com",800);
clientes[4]  = new ClienteVip("albtert","hjar@gmal.com",200,500);

for(Cliente c:clientes){
System.out.print(c);







*/