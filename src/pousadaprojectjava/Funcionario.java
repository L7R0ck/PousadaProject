/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousadaprojectjava;
import java.util.Date;

/**
 *
 * @authors 
 * Gabrielle Rosa
 * George Lucas 
 * José Inaldo
 * Jhonatas 
 * Saionara
 */
public class Funcionario extends Pessoa{
    	
	private String login;
	private String senha;
	private String funcao;
	
	public Funcionario(int id, String nome, String cpf, Date dataNascimento, String email, String endereco,
			String telefone) {
		super(id, nome, cpf, dataNascimento, email, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	
	public Funcionario(int id, String nome, String cpf, Date dataNascimento, String email, String endereco,
			String telefone, String login, String senha, String funcao) {
		super(id, nome, cpf, dataNascimento, email, endereco, telefone);
		this.login = login;
		this.senha = senha;
		this.funcao = funcao;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
