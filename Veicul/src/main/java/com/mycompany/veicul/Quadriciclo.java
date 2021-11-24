
package com.mycompany.veicul;


public class Quadriciclo extends veiculo {

    private float fatorRisco;
    
    public Quadriciclo(String modelo, String placa,float valorDiaria, float fatorRisco) {
        super(modelo, placa,valorDiaria);
        this.fatorRisco = fatorRisco;
    }

    @Override
    public float calcularAluguel(int qtdDias) {
        return qtdDias*super.getValorDiaria()+ fatorRisco;
    }
    
}
