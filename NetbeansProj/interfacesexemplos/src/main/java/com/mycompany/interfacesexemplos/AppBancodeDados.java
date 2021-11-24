
package com.mycompany.interfacesexemplos;



public class AppBancodeDados {
    public static void main(String args[]){
        
        DriverMySQL x = new DriverMySQL();
        x.conectar("localhost");
        x.executar("Select* from tabela");
        
        
        
    }
}
