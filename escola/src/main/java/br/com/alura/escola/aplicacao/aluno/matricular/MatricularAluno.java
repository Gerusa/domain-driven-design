package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.PublicadorDeEventos;
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
	private final PublicadorDeEventos publicador;

	public MatricularAluno(final RepositorioDeAlunos repositorio, final PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}

	// COMMAND
	public void matricular(MatricularAlunoDTO dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		
		AlunoMatriculado evento = new AlunoMatriculado(new CPF(novo.getCpf()));
		publicador.publicar(evento);

	}

}
