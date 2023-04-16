/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho.estrutira.de.dados;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class OrdenacaoSelecao {
    private int tamanho;
    private int []vetor;
    private long inicio;
    private long fim;

    public OrdenacaoSelecao() {
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
    
    public void ordenacaoSelecao(){
        inicio = System.currentTimeMillis();
        for(int i = 0; i < vetor.length; i++){
            int auxiliar = 0;
            for(int j = 0; j < vetor.length; j++){
                if(vetor[j] > vetor[i]){
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }    
            }
        }
        fim = System.currentTimeMillis(); 
        long tempo = this.fim - this.inicio;
        System.out.println("O tempo de Execução da Ordenação por Insercao foi: "+tempo);
    }
}
