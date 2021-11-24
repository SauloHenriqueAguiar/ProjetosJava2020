
package com.mycompany.universesa;


public class QuestaoComDica extends QuestaoSimples{
    private String dica;
    public QuestaoComDica(String e, String r,String dica) {
        super(e, r);
        this.dica =dica;
    }
    @Override
 public String aplicarQuestao(){
     return "P:"+ enunciado + "\n  (dica)" + dica;
 }   
 
}
