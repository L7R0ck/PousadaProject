/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousadaprojectjava;

/**
 *
 * @authors 
 * Gabrielle Rosa
 * George Lucas 
 * José Inaldo
 * Jhonatas 
 * Saionara
 */

public class Pousada {
    final int totalQuartos = 30;
    int quartSolteiro;
    int quartCasal;
    int quartFamilia;
    int[] totalClientes;
    
    //Constructor
    public void Pousada(){
        this.quartSolteiro = 10;
        this.quartCasal = 10;
        this.quartFamilia = 10;
        totalClientes = new int[1];
    }
}
