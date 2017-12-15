/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousadaprojectjava;
import java.util.Date;
import validacoes.ValidarCPF;

/**
 *
 * @authors 
 * Gabrielle Rosa
 * George Lucas 
 * José Inaldo
 * Jhonatas 
 * Saionara
 */

public class Cliente extends Pessoa {
	public Cliente(int id, String nome, String cpf, Date dataNascimento, String email, String endereco,
			String telefone) {
		super(id, nome, cpf, dataNascimento, email, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	public String validarCpf(String cpf){
		ValidarCPF.isCPF(cpf);
		ValidarCPF.imprimeCPF(cpf);
		return cpf;
	}
}
