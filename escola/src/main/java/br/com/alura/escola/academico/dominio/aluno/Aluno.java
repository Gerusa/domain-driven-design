package br.com.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma entidade, tem uma identifica��o �nica.
 *
 */
//No mundo DDD essa classe � chamada de AGGREATE(tem uma cole��o de outros objetos: cpf, email, telefones) ROOT(mant�m, � a ra�z)
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

	// Invariante: uma regra de neg�cio que deve sempre ser verdadeira para o objeto
	// ser v�lido.
	// Caso o aluno tenha mais de 2 telefones, o mesmo estar� em um estado inv�lido.
	public void adicionarTelefone(String ddd, String numero) {
		if (telefones.size() == 2) {
			throw new IllegalArgumentException("Permitido no m�ximo 2 telefones!");
		}
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
