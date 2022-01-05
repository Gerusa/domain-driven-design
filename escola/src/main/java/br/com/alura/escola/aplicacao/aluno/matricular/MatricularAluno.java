package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

/**
 * Classe usando o padrão de projeto COMMAND, padrão usado para executar uma
 * ação.
 * 
 * Serviço da camada de aplicação - use case. Os termos Use Case, Application
 * Service e Command Handler são basicamente sinônimos e servem para fornecer
 * pontos de entrada na sua aplicação, de forma independente dos mecanismos de
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
