package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

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
