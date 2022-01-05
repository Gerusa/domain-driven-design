package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma entidade, tem uma identifica��o �nica.
 *
 */
public class Aluno {

	// id n�o � conceito de dom�nio da aplica��o, e sim da infra-estrutura
	// private Long id;

	// o cpf ser� usado para distinguir dois objetos
	private CPF cpf;

	private String nome;

	private Email email;

	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));

	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

}
