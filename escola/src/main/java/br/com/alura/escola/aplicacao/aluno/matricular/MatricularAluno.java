package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

/**
 * Classe usando o padr�o de projeto COMMAND, padr�o usado para executar uma
 * a��o.
 * 
 * Servi�o da camada de aplica��o - use case. Os termos Use Case, Application
 * Service e Command Handler s�o basicamente sin�nimos e servem para fornecer
 * pontos de entrada na sua aplica��o, de forma independente dos mecanismos de
 * entrega (Web, CLI, etc).
 *
 */
public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(final RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	// COMMAND
	public void matricular(MatricularAlunoDTO dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);

	}

}
