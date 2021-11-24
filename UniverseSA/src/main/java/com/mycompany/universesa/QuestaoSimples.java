
package com.mycompany.universesa;


public class QuestaoSimples {
    protected String enunciado;
    protected String resposta;

    public QuestaoSimples(String e, String r) {
        this.enunciado = e;
        this.resposta = r;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    public boolean corrigir(String resposta){
        return this.resposta.equals(resposta);
    }
public String aplicarQuestao(){
    return "P:" + enunciado;
}    
}
