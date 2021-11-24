
package com.mycompany.universesa;

import java.util.Scanner;


public class Prova {
    public static void main(String args[]){
        Scanner valor = new Scanner(System.in);
        QuestaoSimples perguntas [];
        perguntas = new QuestaoSimples[5];
        
        
        perguntas [0] = new QuestaoSimples(" Qual a capital de Nova York?","ny");
        perguntas [1] = new QuestaoMultiplaEscolha(" Qual a capital do Brasil?","b","brasilia","salvador","recife","sao paulo");
        perguntas [2] = new QuestaoComDica(" Qual a linguagem do backend?","java","inicia com J");
        perguntas [3] = new QuestaoSimples(" Qual a formula da Agua?","h20");
        perguntas [4] = new QuestaoMultiplaEscolha(" Qual o game do ano 2018?","a","god of war","fifa","shadow of the colossus","zelda");

        
        
int pontos =  0;
System.out.println("Prova do isidro!");
for (int i=0;i <perguntas.length; i++){
    System.out.println(perguntas[i].aplicarQuestao());
    System.out.println("sua resposta: ");
    String resp = valor.nextLine();
    
    if (perguntas[i].corrigir(resp)){
        pontos +=2;
    }
    
}
        
        System.out.println("Sua nota final vale: " + pontos);
    }
}
