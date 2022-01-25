package br.com.alura.escola.academico.dominio.aluno;

import java.util.List;

/**
 * A implementação dessa interface, será feita por uma camada externa.
 * Dessa forma, isolamos o domínio de detalhes de persistência.
 *
 */
public interface RepositorioDeAlunos {

	/**
	 * Salva um aluno. Foi chamado de matricular, pois é como a equipe de negócio se
	 * refere.
	 * 
	 * @param aluno
	 */
	void matricular(Aluno aluno);

	Aluno buscarPorCPF(CPF cpf);

	List<Aluno> listarTodosAlunosMatriculados();

}
