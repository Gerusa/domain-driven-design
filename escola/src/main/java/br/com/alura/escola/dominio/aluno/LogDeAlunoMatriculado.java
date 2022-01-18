package br.com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

/**
 * Classe Ouvinte para o Evento AlunoMatriculado.
 *
 */
public class LogDeAlunoMatriculado extends Ouvinte {

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}

	@Override
	public void reageAo(Evento evento) {
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyu HH:mm"));

		System.out.println(String.format("Aluno com CPF %s matriculado em: %s",
				((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado));
	}

}
