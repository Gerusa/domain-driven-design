package br.com.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma entidade, tem uma identificação única.
 *
 */
//No mundo DDD essa classe é chamada de AGGREATE(tem uma coleção de outros objetos: cpf, email, telefones) ROOT(mantém, é a raíz)
public class Aluno {

	// id não é conceito de domínio da aplicação, e sim da infra-estrutura
	// private Long id;

	// o cpf será usado para distinguir dois objetos
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

	// Invariante: uma regra de negócio que deve sempre ser verdadeira para o objeto
	// ser válido.
	// Caso o aluno tenha mais de 2 telefones, o mesmo estará em um estado inválido.
	public void adicionarTelefone(String ddd, String numero) {
		if (telefones.size() == 2) {
			throw new IllegalArgumentException("Permitido no máximo 2 telefones!");
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
