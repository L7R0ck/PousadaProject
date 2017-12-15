/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousadaprojectjava;
import java.time.LocalDate;

/**
 *
 * @authors 
 * Gabrielle Rosa
 * George Lucas 
 * José Inaldo
 * Jhonatas 
 * Saionara
 */

public class Aluguel {
    private int idAluguel;
    private Cliente cliente;
    private Quarto quarto;
    private int dias;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Aluguel(int idAluguel, Cliente cliente, Quarto quarto, LocalDate checkIn, LocalDate checkOut) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public boolean estaOcupadoNaData(CollectionAlugueis colAlugueis) {
        for (Aluguel existente: colAlugueis.getListaAlugueis()) {
            if (!(this.checkIn.isAfter(existente.getCheckOut()) || this.checkOut.isBefore(existente.getCheckIn())))
                return true;
        }
        return false;
    }
    public int diasTotal() {
        //this.dias
        return dias;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
}
