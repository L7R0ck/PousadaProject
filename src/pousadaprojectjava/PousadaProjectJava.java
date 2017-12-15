/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousadaprojectjava;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @authors 
 * Gabrielle Rosa
 * George Lucas 
 * José Inaldo
 * Jhonatas 
 * Saionara
 */

public class PousadaProjectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate dateTime;
        Date dataAtual = new Date();
        System.out.println("Date - Data e Hora atual: " + dataAtual);
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar - Data e Hora atual: " + c.getTime());
    }
    
}
