
package com.mycompany.veicul;


public class Carro extends veiculo {

    public Carro(String modelo, String placa,float valorDiaria) {
        super(modelo, placa,valorDiaria);
        
    }

    @Override
    public float calcularAluguel(int qtdDias) {
        return qtdDias*super.getValorDiaria();
    }
    
    
}
