package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.academico.dominio.Evento;
import br.com.alura.escola.shared.dominio.CPF;

/**
 * Evento
 *
 */
public class AlunoMatriculado implements Evento {

	private final CPF cpfDoAluno;
	private LocalDateTime momento;

	public AlunoMatriculado(CPF cpfDoAluno) {
		super();
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

}
