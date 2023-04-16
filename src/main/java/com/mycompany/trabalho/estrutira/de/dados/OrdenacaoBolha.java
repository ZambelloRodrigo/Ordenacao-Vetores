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
public class OrdenacaoBolha {
    private int tamanho;
    private int []vetor;
    private long inicio;
    private long fim;

    public OrdenacaoBolha() {
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
                                            + "Informe um numero inteiro!"));
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
    
    public void ordenacaoBolha(){
        inicio = System.currentTimeMillis();
        boolean troca = true;
        
        while(troca){
            troca = false;
           for(int i = 0; i < vetor.length -1; i++){
               if(vetor[i] > vetor[i+1]){
                   int auxiliar = vetor[i];
                   vetor[i] = vetor[i+1];
                   vetor[i+1] = auxiliar;
                   troca = true;
               }
           } 
        }
        
        fim = System.currentTimeMillis(); 
        long tempo = this.fim - this.inicio;
        System.out.println("O tempo de Execução da Ordenaçao por Insercao foi: "+tempo);
    }
}
