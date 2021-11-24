
package com.mycompany.veicul;


public class Locador {
    public static void main(String args[]){
        
        veiculo estoque [];
        
        estoque = new veiculo[5];
        
        estoque [0] = new Carro("Honda Civic","GFD535",50.0f);
        estoque [1] = new Moto("Honda CG","HRR536",25.0f,67.0f);
        estoque [2] = new Quadriciclo("Motoca China","FFT984",150.0f,500.0f);
        estoque [3] = new Carro("SW4 ","GGB1265",300.0f);
        estoque [4] = new Moto("KAWASAK Ninja","VVG431",400.0f,25.0f);
        
for(veiculo v: estoque){
    System.out.println("Veiculo:   " + v.getModelo() + "   Aluguel:  R$"+ v.calcularAluguel(7) );
}
        
        
    }
}
