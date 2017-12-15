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

public class Quarto {
    private int id;
    private int NumeroDoQuarto;
    private String TipoQuarto;
    private float preco; 
    private String status;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDoQuarto() {
        return NumeroDoQuarto;
    }

    public void setNumeroDoQuarto(int NumeroDoQuarto) {
        this.NumeroDoQuarto = NumeroDoQuarto;
    }

    public String getTipoQuarto() {
        return TipoQuarto;
    }

    public void setTipoQuarto(String TipoQuarto) {
        this.TipoQuarto = TipoQuarto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
