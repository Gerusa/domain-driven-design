package br.com.alura.escola.academico;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.PublicadorDeEventos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

/**
 * Simula a interface que o usuário utiliza para matricular um aluno.
 *
 */
public class InterfaceUsuarioMatricularAluno {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.matricular(new MatricularAlunoDTO(nome, cpf, email));
	}

}
