/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho.estrutira.de.dados;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigozambello
 */
public class Main {
    
    public static void main(String[] args) {
        boolean continuaPrograma = true;
        int contador = 0;
        
        while (continuaPrograma){
            String escolha = JOptionPane.showInputDialog("Escolha um metodo de Ordenação \n"
                + "1: Inserção\n"
                + "2: Seleção\n"
                + "3: Bolha\n"
                + "Adicione um dos númerps");

            switch (escolha){
                case "1":
                    
                    OrdenacaoInsercao insercao = new OrdenacaoInsercao();
                    
                    insercao.setTamanho(Integer.parseInt
                                    (JOptionPane.showInputDialog("Qual o "
                                            + "tamanho do vertor?")));
                    
                    insercao.completandoVetor();
                    insercao.getVetor();
                    insercao.separarVetor();
                    insercao.ordenacaoInsercao();
                    insercao.separarVetor();
                    insercao.getVetor();
                    
                    contador += 1;
                    break;
                case "2":
                    OrdenacaoSelecao selecao = new OrdenacaoSelecao();
                    
                    selecao.setTamanho(Integer.parseInt
                                    (JOptionPane.showInputDialog("Qual o "
                                            + "tamanho do vertor?")));
                    
                    selecao.completandoVetor();
                    selecao.getVetor();
                    selecao.separarVetor();
                    selecao.ordenacaoSelecao();
                    selecao.separarVetor();
                    selecao.getVetor();
                    
                    contador += 1;
                    break;
                case "3":
                    OrdenacaoBolha bolha = new OrdenacaoBolha();
                    
                    bolha.setTamanho(Integer.parseInt
                                    (JOptionPane.showInputDialog("Qual o "
                                            + "tamanho do vertor?")));
                    
                    bolha.completandoVetor();
                    bolha.getVetor();
                    bolha.separarVetor();
                    bolha.ordenacaoBolha();
                    bolha.separarVetor();
                    bolha.getVetor();
                    
                    contador += 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha um de 1 à 3");
                    break;
            }
            
            if(contador == 3){
                
            }
        }
        
        

    }
}