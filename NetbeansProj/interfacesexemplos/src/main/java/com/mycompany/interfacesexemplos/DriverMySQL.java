
package com.mycompany.interfacesexemplos;



public class DriverMySQL implements interfaceBD {

    @Override
    public void conectar(String servidor) {
    System.out.println("MYSQL> conecting on " + servidor );
    }

    @Override
    public void executar(String SQL) {
    System.out.println("MYSQL " + SQL + "executed");
    }
    
    
}
