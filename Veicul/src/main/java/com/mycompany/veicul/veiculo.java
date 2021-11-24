
package com.mycompany.veicul;



public abstract class veiculo {
    private String modelo;
    private String placa;
    float valorDiaria;

    public veiculo(String modelo, String placa, float valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public abstract float calcularAluguel(int qtdDias);
    
}
