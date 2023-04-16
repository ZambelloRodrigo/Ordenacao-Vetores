/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho.estrutira.de.dados;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigozambello
 */
public class OrdenacaoInsercao {
    private int tamanho;
    private int []vetor;
    private long inicio;
    private long fim;

    public OrdenacaoInsercao() {
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.vetor = new int[tamanho];
    }
    
    public void completandoVetor(){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(
                                    JOptionPane.showInputDialog(""
                                            + "Inform um número inteiro!"));
        }
    }
    
    public void getVetor(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
    }
    
    public void separarVetor(){
        System.out.println("----------------------------\n");
    }
    
    public void ordenacaoInsercao(){
        inicio = System.currentTimeMillis();
        int chave = 0;
        int j;
        
        for (int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            for(j = i-1; (j >= 0 && vetor[j] > chave ); j--){
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }
        fim = System.currentTimeMillis(); 
        long tempo = this.fim - this.inicio;
        System.out.println("O tempo de Execução da Ordenação por Insercao foi: "+tempo);
    }
}