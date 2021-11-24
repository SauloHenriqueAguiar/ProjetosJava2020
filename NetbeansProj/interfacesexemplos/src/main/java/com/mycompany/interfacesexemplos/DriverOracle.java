
package com.mycompany.interfacesexemplos;



public class DriverOracle implements interfaceBD {

    @Override
    public void conectar(String servidor) {
    System.out.println("Oracle" + servidor +"Connected");

        
    }

    @Override
    public void executar(String SQL) {
    System.out.println("Oracle> Executng" + SQL);

    }
    
}
