package br.com.alura.escola.academico.dominio.aluno;

import java.util.List;

/**
 * A implementa��o dessa interface, ser� feita por uma camada externa.
 * Dessa forma, isolamos o dom�nio de detalhes de persist�ncia.
 *
 */
public interface RepositorioDeAlunos {

	/**
	 * Salva um aluno. Foi chamado de matricular, pois � como a equipe de neg�cio se
	 * refere.
	 * 
	 * @param aluno
	 */
	void matricular(Aluno aluno);

	Aluno buscarPorCPF(CPF cpf);

	List<Aluno> listarTodosAlunosMatriculados();

}
