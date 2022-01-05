package br.com.alura.escola.dominio.aluno;

/**
 * Padr�o Builder, para constru��o do objeto Aluno.
 *
 */
public class FabricaDeAluno {

	private Aluno aluno;

	/**
	 * Dessa forma fica claro, atrav�s do pr�prio nome do m�todo, a ordem dos
	 * par�metros, evitando que se passe um cpf no lugar do nome, por exemplo. E
	 * toda a 'complexidade' de cria��o fica encapsulada dentro desse m�todo. Ex:
	 * passa o cpf, ao inv�s de passar um objeto CPF.
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
			throw new IllegalArgumentException("Necess�rio criar Aluno antes de adicionar telefone");
		}

		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}

	public Aluno criar() {
		return this.aluno;
	}

}
