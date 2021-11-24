
package com.mycompany.televison;


public class AppTelevisao {
    public static void main(String args[]){
        int a;
        String b;
        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao();

        
        t1.marca  = "AOC";
        t1.ligada  = false;
        t1.canal  = 5;
        t1.volume  = 0;
        
        t2.marca  = "LG";
        t2.ligada  = true;
        t2.canal  = 7;
        t2.volume  = 45;
        
        
        t1.ligar();
        t1.aumentarVolume();
        t1.avancarCanal();
        
        t2.ligar();
        t2.aumentarVolume();
        t2.avancarCanal();
        
        
    }
}
