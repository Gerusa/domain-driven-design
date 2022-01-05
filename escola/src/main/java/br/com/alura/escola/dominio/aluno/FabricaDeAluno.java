package br.com.alura.escola.dominio.aluno;

/**
 * Padrão Builder, para construção do objeto Aluno.
 *
 */
public class FabricaDeAluno {

	private Aluno aluno;

	/**
	 * Dessa forma fica claro, através do próprio nome do método, a ordem dos
	 * parâmetros, evitando que se passe um cpf no lugar do nome, por exemplo. E
	 * toda a 'complexidade' de criação fica encapsulada dentro desse método. Ex:
	 * passa o cpf, ao invés de passar um objeto CPF.
	 * 
	 * @param nome
	 * @param cpf
	 * @param email
	 * @return
	 */
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}

	public FabricaDeAluno comTelefone(String ddd, String numero) {
		if (this.aluno == null) {
			throw new IllegalArgumentException("Necessário criar Aluno antes de adicionar telefone");
		}

		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}

	public Aluno criar() {
		return this.aluno;
	}

}
